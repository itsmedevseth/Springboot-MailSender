package com.mailrestapi.mailrestapi.Controller;

import com.mailrestapi.mailrestapi.Model.Email;
import com.mailrestapi.mailrestapi.Model.Respone;
import com.mailrestapi.mailrestapi.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/sendMail")
    public Respone Sendmail(@RequestBody Email email)
    {
        return  emailService.sendEmail(email);
    }
}
