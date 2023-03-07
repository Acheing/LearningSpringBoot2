package com.example.day3.Controller;

import com.example.day3.Model.User;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping("/{username}")
    @ResponseBody
    public User getUser(@PathVariable String username){
        User u = new User();
        u.setName(username);
        u.setAge(20);
        u.setPassword("OvO");
        return u;
    }
}
