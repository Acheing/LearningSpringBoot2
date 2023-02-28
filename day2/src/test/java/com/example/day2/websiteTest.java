package com.example.day2;

import com.example.day2.model.WebSiteProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class websiteTest {
    @Autowired
    private WebSiteProperties website;

    @Test
    void getProperties(){
        System.out.println(website.getName());
        System.out.println(website.getWebsite());
        System.out.println(website.getLanguage());
    }
}

//测试一个实体类