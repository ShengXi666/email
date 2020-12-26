package com.cyxssz.email.entity;

import lombok.Data;


/**
 * @author shengxi
 */
@Data
public class User {
    /**
     *主键
     */
    private Integer id;
    /**
     *用户名
     */
    private String username;
    /**
     *密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String useremail;
    /**
     * 激活状态 0 未激活 1 已激活
     */
    private Integer status;
    /**
     * 激活码
     */
    private String code;


}
