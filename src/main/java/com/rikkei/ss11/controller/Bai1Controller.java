package com.rikkei.ss11.controller;

import com.rikkei.ss11.model.Bai1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Bai1Controller {

    @GetMapping("/userForm")
    public String showForm(Model model) {
        model.addAttribute("user", new Bai1());
        return "Bai1";
    }

    @PostMapping("/userForm")
    public String submitForm(@Valid @ModelAttribute("user") Bai1 user,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "Bai1";
        }
        return "ResultBai1";
    }

}
