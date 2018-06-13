package com.hson.core;

import com.hson.core.bean.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppMailConfig.class)
public class MailSendTest {

   @Autowired
   private MailService mailService;



    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(mailService);
    }


    @Test
    public void testSimpleMail(){
            mailService.sendSimpleMailMessage("send");
    }

    @Test
    public void testWithAttachment() throws Exception{
        mailService.sendWithAttachment("attachment");
    }


    @Test
    public void testWithHtml() throws Exception{
        mailService.sendHtml("html");
    }

    @Test
    public void testWithVelocity() throws Exception{
        mailService.sendVelocity("SUPER DATA");
    }
}

