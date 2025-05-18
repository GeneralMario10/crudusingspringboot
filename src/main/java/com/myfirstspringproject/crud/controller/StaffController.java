package com.myfirstspringproject.crud.controller;

import com.myfirstspringproject.crud.Constants;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.myfirstspringproject.crud.Staff;
import com.myfirstspringproject.crud.service.StaffService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//import org.springframework.web.servlet.mvc.Controller;


@Controller
public class StaffController {
 
    
    @Autowired
    StaffService staffService;   
@GetMapping("/")
public String addStaff(Model myModel,@RequestParam(required = false) String id){
    myModel.addAttribute("newstaff", staffService.getStaffById(id) );
    return "addstaff";
}    
@PostMapping("/dataSubmitForm")
public String postMethodName(@Valid @ModelAttribute("newstaff") Staff staff ,BindingResult result) {
    ///Staff staff2=new Staff(12000, "ffffff", "sdsds");
    if (result.hasErrors()) {
        return "addstaff";
    }
    int index=staffService.getStaffIndex(staff.getId());
    if(index==Constants.NO_MATCH){
        staffService.addStaff(staff);
    }else{
        staffService.updateStaff(staff, index);
    }
    
    return "redirect:/staffdetails";
    
}

@GetMapping("/staffdetails")
public String getMethodName(Model myModel) {
    myModel.addAttribute("allStaff", staffService.getAllStaff());
    return "staffdetails";
}


}
