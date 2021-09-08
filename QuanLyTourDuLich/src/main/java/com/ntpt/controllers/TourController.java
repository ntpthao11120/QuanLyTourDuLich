/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntpt.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ntpt.pojos.Tour;
import com.ntpt.service.TourService;
import com.ntpt.validator.TourNameValidator;
import com.ntpt.validator.WebAppValidator;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ntpth
 */
@Controller
public class TourController {
    @Autowired
    private TourService tourService;
    @Autowired
    private WebAppValidator tourValidator;
    
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setValidator(tourValidator);
    }
    
    @GetMapping("/admin/tours")
    public String list(Model model){
        model.addAttribute("tour", new Tour());
        return "tour";
    }
    
    @PostMapping("/admin/tours")
    public String add(Model model, @ModelAttribute(value = "tour") @Valid Tour tour,
            BindingResult result){
        if(!result.hasErrors()){
            if(this.tourService.addOrUpdate(tour))
                return "redirect:/";
            else
                model.addAttribute("errMsg", "Đã có lỗi!!");
        }
            
        return "tour";
    
    }
}
