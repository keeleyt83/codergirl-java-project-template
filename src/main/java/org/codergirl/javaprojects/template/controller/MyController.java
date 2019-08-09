package org.codergirl.javaprojects.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/yeah")
@Controller
public class MyController {

  @GetMapping("/stuff")
  public String stuff() {
    return "stuff.html";
  }

}
