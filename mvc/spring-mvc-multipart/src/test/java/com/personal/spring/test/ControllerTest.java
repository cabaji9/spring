package com.personal.spring.test;

import com.personal.spring.configuration.AppConfig;
import com.personal.spring.controller.FormController;
import com.personal.spring.model.User;
import com.personal.spring.service.HelloService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by Hyun Woo Son on 6/13/18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@WebAppConfiguration
public class ControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;


    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void testOtherControllerView() throws Exception {

        mvc.perform(get("/other")).andDo(print()).
                andExpect(view().name("other")).
                andExpect(model().attributeExists("otherList")).
                andExpect(model().attribute("otherList", Arrays.asList("uno", "dos", "tres")));
    }

    @Test
    public void testFormControllerView() throws Exception {
        mvc.perform(get("/form")).andDo(print()).
                andExpect(view().name("form"));
    }


    @Test
    public void testFormSave() throws Exception {
        HelloService helloService = Mockito.mock(HelloService.class);

        doNothing().when(helloService).saveUser(any(User.class));

        FormController formController = new FormController(helloService);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(formController).build();
        mockMvc.perform(post("/form")
                .param("firstName","lala")
                .param("lastName","lolo")
        ).andExpect(redirectedUrl("/hello-user/lala"));

        verify(helloService,atLeastOnce()).saveUser(any(User.class));

    }


}
