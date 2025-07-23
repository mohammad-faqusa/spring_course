package com.luv2code.springdemo.mvc.rest;

import com.luv2code.springdemo.mvc.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        binder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/")
    public String showFrom(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @PostMapping("/processFrom")
    public String processFrom(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult
    ) {
        System.out.println(theCustomer);
        System.out.println(theBindingResult.toString());
        if (theBindingResult.hasErrors()) {
            return "customer-form";
        }
        else {
            return "customer-confirmation";
        }
    }
}
