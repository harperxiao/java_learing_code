package com.hp.contoller;

import com.hp.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("测试");
        try{
            int a= 10/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new SysException("查询出错");
        }
        return "success";
    }
}
