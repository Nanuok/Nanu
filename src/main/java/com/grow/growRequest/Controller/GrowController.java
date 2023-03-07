package com.grow.growRequest.Controller;

import com.grow.growRequest.Entity.Grow;
import com.grow.growRequest.Services.GrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrowController {
    @Autowired
    private GrowService growService;
    @RequestMapping("/")
    public String viewGrowRequestPage(){
        return "grow_Create";
    }
    //localhost:8080/saveGrow
    @RequestMapping("/saveGrow")
    public String saveGrowRequest(@ModelAttribute("grow")Grow grow, Model model){
        growService.saveOneGrow(grow);
        model.addAttribute("grow",grow);
        return "grow_info";
    }

}
