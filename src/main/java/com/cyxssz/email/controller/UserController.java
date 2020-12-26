package com.cyxssz.email.controller;

import com.cyxssz.email.common.UUIDUtils;
import com.cyxssz.email.entity.User;
import com.cyxssz.email.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @author shengxi
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/registerUser")
    public String register(User user){
        user.setStatus(0);
        String code = UUIDUtils.getUUID() + UUIDUtils.getUUID();
        user.setCode(code);
        userService.register(user);
        return "success";
    }

    /**
     *  校验激活码
     * @param code
     * @return
     */
    @RequestMapping(value = "/checkCode")
    public String checkCode(String code){
        User user = userService.checkCode(code);
        //如果用户不等于null，把用户状态修改status=1
        if (user !=null){
            user.setStatus(1);
            //把code验证码清空，已经不需要了
            user.setCode("");
            System.out.print(user);
            userService.updateUserStatus(user);
        }
        return "login";
    }

    /**
     * 跳转到登录页面
     * @return login
     */
    @RequestMapping(value = "/loginPage")
    public String login(){
        return "login";
    }

    /**
     *登录
     * @param user
     * @param model
     * @return
     */

    @RequestMapping(value = "/login")
    public String login(User user, Model model){
        User u = userService.loginUser(user);
        if (u !=null){
            return "welcome";
        }
        return "login";
    }


}
