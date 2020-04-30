package cn.hp.web.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DownUtils {
    public static String getFileName(String agent,String filename) throws UnsupportedEncodingException {
        if (agent.contains("MSIE")){
            filename = URLEncoder.encode(filename,"utf-8");
            filename = filename.replace("+"," ");
        }else if (agent.contains("Firefox")){
            BASE64Encoder base64Encoder = new BASE64Encoder();
            filename = "=?utf-8?B?" + base64Encoder.encode(filename.getBytes("utf-8")) + "?=";
        }else{
            filename = URLEncoder.encode(filename,"utf-8");
        }



        return filename;
    }
}
