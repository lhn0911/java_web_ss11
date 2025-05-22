package com.rikkei.ss11.controller;

import com.rikkei.ss11.model.Bai2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Bai2Controller {
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new Bai2());
        return "registerForm";
    }

    @PostMapping("/register")
    public String processForm(@Valid @ModelAttribute("user") Bai2 user,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "registerForm";
        }
        return "registerSuccess";
    }
}
