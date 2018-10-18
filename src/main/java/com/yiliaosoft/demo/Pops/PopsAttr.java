package com.yiliaosoft.demo.Pops;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PopsAttr {
    @Value("${com.yiliaosoft.pops.name}")
    private String name;

    @Value("${com.yiliaosoft.pops.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
