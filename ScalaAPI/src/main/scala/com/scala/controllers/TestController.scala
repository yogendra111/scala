package com.scala.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class TestController {

  @GetMapping(path=Array("/hello"))
  def hello = {
    "Hii, Let's begin Spring with Scala"
  }
  @GetMapping(path=Array("/list"))
  def list: List[String] = {
    List("Hii, Let's begin Spring with Scala", "red")
  }

}
