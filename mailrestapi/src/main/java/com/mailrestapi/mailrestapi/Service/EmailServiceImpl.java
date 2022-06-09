package com.mailrestapi.mailrestapi.Service;

import com.mailrestapi.mailrestapi.Model.Email;
import com.mailrestapi.mailrestapi.Model.Respone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailServiceImpl implements EmailService {
    @Autowired
    public JavaMailSender mailSender;
    @Override
    public Respone sendEmail(Email email) {
        Respone respone = new Respone();
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email.getTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());

            mailSender.send(message);

            respone.setCode(0);
            respone.setMessage("email send ok");

        } catch (Exception ex) {
            respone.setCode(1);
            respone.setMessage("error sending email "+ ex.getMessage());


        }
        return  respone;
    }
}
