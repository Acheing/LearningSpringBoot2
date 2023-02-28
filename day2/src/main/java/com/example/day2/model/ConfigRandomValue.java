package com.example.day2.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigRandomValue {
    @Value("${cfg.random.value}")
    private String secret;
    @Value("${cfg.random.number}")
    private int number;
    @Value("${cfg.random.bignumber}")
    private long bigNumber;
    @Value("${cfg.random.uuid}")
    private String uuid;
    @Value("${cfg.random.test1}")
    private int number2;
    @Value("${cfg.random.test2}")
    private int number3;

    public int getNumber() {
        return number;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
        return number3;
    }

    public long getBigNumber() {
        return bigNumber;
    }

    public String getSecret() {
        return secret;
    }

    public String getUuid() {
        return uuid;
    }

    public void setBigNumber(long bigNumber) {
        this.bigNumber = bigNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
