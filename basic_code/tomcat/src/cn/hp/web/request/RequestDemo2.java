package cn.hp.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            String value = request.getHeader(s);
            System.out.println(s+"->"+value);
        }

        String referer = request.getHeader("referer");
        System.out.println(referer);
        if (referer!=null){
            if (referer.contains("Demo2")){
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("播放电影");
            }else{
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("请去正规网站");
            }
        }
    }
}
