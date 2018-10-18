package com.yiliaosoft.demo.ControllerTest;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//引入MockMvc
@AutoConfigureMockMvc
//自动配置MVC测试环境
@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest2 {

    @Autowired
    private MockMvc mockMvc;

    public void getTest() throws Exception{
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.post("/hello"));
        resultActions.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string(""));
        String contentAsString = resultActions.andReturn().getResponse().getContentAsString();

    }
}
