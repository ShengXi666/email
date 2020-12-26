package com.cyxssz.email.common;

import java.util.UUID;

/**
 * 随机生成激活码
 * @author shengxi
 * @email ride0623@qq.com
 * @date 2019/8/30 9:11
 */

public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }


}