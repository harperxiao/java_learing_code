package com.hp.demo2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Demo3Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        while(true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file = new File("F:\\学习资料\\代码\\02-java进阶\\day11_网络编程");
                        if (!file.exists()){
                            file.mkdirs();
                        }
                        String filename = System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";
                        FileOutputStream fos = new FileOutputStream(file+"\\"+filename);

                        int len =0;
                        byte[] bytes = new byte[1024];
                        while((len=is.read(bytes))!=-1){
                            System.out.println(len);
                            fos.write(bytes,0,len);
                        }

                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
    }
}
