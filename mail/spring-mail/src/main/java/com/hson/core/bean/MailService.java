package com.hson.core.bean;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hyun Woo Son on 4/24/18
 **/
@Service("mailService")
public class MailService {


    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private VelocityEngine velocityEngine;


    public void sendSimpleMailMessage(String text){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("noreply@lala.com");
        simpleMailMessage.setTo("uno@com.com");
        simpleMailMessage.setText(text);
        javaMailSender.send(simpleMailMessage);


    }

    public void sendWithAttachment(String text) throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("noreply@lala.com");
        mimeMessageHelper.setTo("uno@com.com");
        mimeMessageHelper.setSubject("subject");
        mimeMessageHelper.setText(text);

        ClassPathResource image = new ClassPathResource("image.jpeg");

        mimeMessageHelper.addAttachment("image",image);
        javaMailSender.send(mimeMessage);


    }


    public void sendHtml(String text) throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("noreply@lala.com");
        mimeMessageHelper.setTo("uno@com.com");
        mimeMessageHelper.setSubject("subject");
        mimeMessageHelper.setText("<html><body><b>"+text+"</b>" +
                "<img src='cid:logo'>" +
                "</body></html>");

        ClassPathResource image = new ClassPathResource("image.jpeg");
        mimeMessageHelper.addInline("logo", image);
        javaMailSender.send(mimeMessage);


    }


    public void sendVelocity(String text) throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("noreply@lala.com");
        mimeMessageHelper.setTo("uno@com.com");
        mimeMessageHelper.setSubject("subject");

        String textVelocity = getVelocityTemplate(text);

        mimeMessageHelper.setText(textVelocity);
        javaMailSender.send(mimeMessage);


    }

    public String getVelocityTemplate(String text){
        Map<String,Object> model = new HashMap<String, Object>();
        model.put("data",text);

        return VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,
                "/templates/velocity/mail.vm",model);
    }









}
