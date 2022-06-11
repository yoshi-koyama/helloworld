package com.raisetech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/hello")
  public String hello() {
    return "hello koyama";
  }

  @GetMapping("/koyama")
  public String koyama() {
    return "I am koyama";
  }

}
