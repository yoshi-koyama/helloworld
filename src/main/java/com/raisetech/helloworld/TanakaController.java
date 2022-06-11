package com.raisetech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TanakaController {

  @GetMapping("/tanaka")
  public String tanaka() {
    return "I am Tanaka";
  }
}
