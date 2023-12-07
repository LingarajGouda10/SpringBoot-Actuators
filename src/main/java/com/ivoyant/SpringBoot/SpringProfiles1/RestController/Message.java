package com.ivoyant.SpringBoot.SpringProfiles1.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Message {


  @GetMapping("/GetMessage")
    public String Messages(){
      return "I am Working in iVoyant";

  }


}
