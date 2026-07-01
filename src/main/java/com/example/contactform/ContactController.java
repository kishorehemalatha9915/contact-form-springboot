package com.example.contactform;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ContactController {

    @PostMapping("/submit")
    public String submitForm(@RequestBody Contactform form) {

        System.out.println("Name: " + form.getName());
        System.out.println("Email: " + form.getEmail());
        System.out.println("Message: " + form.getMessage());

        return "Form submitted successfully";
    }
}
