package com.lu2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showFrom() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processFrom() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String showFormVersionTwo(HttpServletRequest request, Model model) {

        // read the request parameter from HTML form
        String theName = request.getParameter("studentName");
        System.out.println(theName);
        // convert data to upper case
        theName = theName.toUpperCase();

        String result = "Yo ~" + theName;
        // add the data to model
        model.addAttribute("message", result);

        return "helloworld";

    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam String studentName
            , Model model) {

        String theName = studentName;
        // read the request parameter from HTML form
        System.out.println(theName);
        // convert data to upper case
        theName = theName.toUpperCase();

        String result = "Yo ~ from version three : " + theName;
        // add the data to model
        model.addAttribute("message", result);

        return "helloworld";

    }
}
