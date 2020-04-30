package com.hp.demo2;

import java.io.*;
import java.net.Socket;

public class Demo3Client {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\学习资料\\代码\\02-java进阶\\day11_网络编程\\img\\1_cs.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            //5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
            os.write(bytes,0,len);
        }

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();

        //7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        while((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }


        //8.释放资源(FileInputStream,Socket)
        fis.close();
        socket.close();

    }
}
