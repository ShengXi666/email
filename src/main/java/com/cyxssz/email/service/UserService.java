package com.cyxssz.email.service;


import com.cyxssz.email.entity.User;


/**
 * @author shengxi
 */
public interface UserService {
    /**
     * 用户注册
     * @param user
     */
    void register(User user);

    /**
     * 根据激活查找用户
     * @param code
     * @return
     */
    User checkCode(String code);

    /**
     * 修改
     * @param user
     */
    void updateUserStatus(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    User loginUser(User user);
}
