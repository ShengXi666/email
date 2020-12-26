package com.cyxssz.email.dao;

import com.cyxssz.email.entity.User;
import org.springframework.stereotype.Component;



/**
 * @author shengxi
 */
@Component
public interface UserDao {
    /**
     * 注册
     * @param user
     */
    void register(User user);

    /**
     * 查询激活用户
     * @param code
     * @return
     */
    User checkCode(String code);

    /**更新用户
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
