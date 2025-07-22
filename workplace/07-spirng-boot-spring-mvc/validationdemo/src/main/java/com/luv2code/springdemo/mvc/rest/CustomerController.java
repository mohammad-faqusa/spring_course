package com.luv2code.springdemo.mvc.rest;

import com.luv2code.springdemo.mvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomerController {

    @GetMapping
    public String showFrom(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }
}
