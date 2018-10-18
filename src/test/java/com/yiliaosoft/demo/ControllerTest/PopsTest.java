package com.yiliaosoft.demo.ControllerTest;


import com.yiliaosoft.demo.Pops.PopsAttr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class PopsTest {

    @Autowired
    private PopsAttr popsAttr;

    @Test
    public void getHello() throws Exception {
        /*Assert.assertEquals(popsAttr.getName(), "程序猿DD");
        Assert.assertEquals(popsAttr.getTitle(), "Spring Boot教程");*/
        System.out.println(popsAttr.getName());
        System.out.println(popsAttr.getTitle());
    }
}
