package pers.qiyan.riderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.qiyan.riderservice.model.Hello;

@RestController
public class GreetingController {
  @RequestMapping("/hello")
  public Hello greeting(@RequestParam(value = "name",defaultValue = "world") String name){
    return new Hello(name);
  }
}
