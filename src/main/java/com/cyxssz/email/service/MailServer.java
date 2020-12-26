package com.cyxssz.email.service;



/**
 * @author shengxi
 */
public interface MailServer {
    /**
     * 发送多媒体邮件
     * @param to
     * @param subject
     * @param content
     */
    void sendMimeMail(String to, String subject, String content);
}
