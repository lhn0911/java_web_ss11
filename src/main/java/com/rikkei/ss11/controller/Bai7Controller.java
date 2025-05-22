package com.rikkei.ss11.controller;

import com.rikkei.ss11.model.ReviewDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Bai7Controller {
    @GetMapping("/review")
    public String showReviewForm(Model model) {
        model.addAttribute("reviewDto", new ReviewDto());
        return "reviewForm";
    }

    @PostMapping("/review")
    public String submitReview(@Valid @ModelAttribute("reviewDto") ReviewDto reviewDto,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "reviewForm";
        }
        return "reviewSuccess";
    }
}
