package com.cyxssz.email.service.impl;

import com.cyxssz.email.dao.UserDao;
import com.cyxssz.email.entity.User;
import com.cyxssz.email.service.MailServer;
import com.cyxssz.email.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author shengxi
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private MailServer mailServer;

    @Override
    public void register(User user) {
        userDao. register(user);
        //获取激活码
        String code =user.getCode();
        System.out.print("激活码"+code);
        //主题
        String subject ="欢迎注册";
    //上面的激活码发送到用户注册邮箱
        String context = "<a href=\"http://localhost:8080/user/checkCode?code="+code+"\">激活请点击</a>,如果非本人操作请忽略";
        //发送激活邮件
        mailServer.sendMimeMail (user.getUseremail(),subject,context);
    }

    @Override
    public User checkCode(String code) {
        return userDao.checkCode(code);
    }

    @Override
    public void updateUserStatus(User user) {
        userDao.updateUserStatus(user);
    }

    @Override
    public User loginUser(User user) {
        User user1=userDao.loginUser(user);
        if (user1 !=null){
            return user1;
        }
        return null;
    }
}
