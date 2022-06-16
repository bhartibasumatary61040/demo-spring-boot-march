package com.example.controller;

import com.example.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {
    @Autowired
    AppFlowService appFlowService;
    @RequestMapping("/app_flow")
     public String message(){
         return appFlowService.message();
     }
}
