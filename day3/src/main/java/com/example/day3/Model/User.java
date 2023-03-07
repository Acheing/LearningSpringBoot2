package com.example.day3.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class User {
    @NotBlank(message = "Not Blank!")
    @Length(min = 2, max = 10, message = "Length Error!")
    public String name;
    public int age;
    public String password;

}
