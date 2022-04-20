package id.ac.uin.sbfp.springbootforgotpassword.service.framework;

import id.ac.uin.sbfp.springbootforgotpassword.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}