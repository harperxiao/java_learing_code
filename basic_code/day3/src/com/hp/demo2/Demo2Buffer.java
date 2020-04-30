package com.hp.demo2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2Buffer {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        String line;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            line = entry.getKey()+"."+entry.getValue();
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
