package com.example.day3.Controller;

import com.example.day3.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @RequestMapping("/save2")
    @ResponseBody
    public String save2(@RequestBody Student student){
        String firstName = student.getFirstname();
        String lastName = student.getLastname();
        return firstName + lastName;
    }
    @RequestMapping("/save1")
    @ResponseBody
    public String save1(Student student){
        String firstName = student.getFirstname();
        String lastName = student.getLastname();
        return firstName + lastName;
    }
}
