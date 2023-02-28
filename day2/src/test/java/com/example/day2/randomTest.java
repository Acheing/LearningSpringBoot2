package com.example.day2;

import com.example.day2.model.ConfigRandomValue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class randomTest {
    @Autowired
    private ConfigRandomValue randomValue;

    @Test
    void getRandom(){
        System.out.println(randomValue.getSecret());
        System.out.println(randomValue.getUuid());
        System.out.println(randomValue.getBigNumber());
        System.out.println(randomValue.getNumber());
        System.out.println(randomValue.getNumber2());
        System.out.println(randomValue.getNumber3());
    }
}
