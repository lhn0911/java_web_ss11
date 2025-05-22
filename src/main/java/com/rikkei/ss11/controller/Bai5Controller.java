package com.rikkei.ss11.controller;

import com.rikkei.ss11.repository.validationgroup;
import com.rikkei.ss11.model.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.SmartValidator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Bai5Controller {

    @GetMapping("/registerB5")
    public String showForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "registerB5";
    }

    @PostMapping("/registerB5")
    public String submitForm(@ModelAttribute("userDto") UserDto userDto,
                             BindingResult bindingResult,
                             Model model) {

        Class<?> validationGroup = "admin".equalsIgnoreCase(userDto.getRole())
                ? validationgroup.AdminGroup.class : validationgroup.UserGroup.class;

        SmartValidator validator = new LocalValidatorFactoryBean();
        validator.validate(userDto, bindingResult, validationGroup);

        if (bindingResult.hasErrors()) {
            return "registerB5";
        }

        return "registerSuccess";
    }
}
