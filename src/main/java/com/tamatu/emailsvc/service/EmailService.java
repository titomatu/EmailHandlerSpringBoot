package com.tamatu.emailsvc.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(String to, String subject, String text){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("tamatu@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        this.javaMailSender.send(message);
    }
}
