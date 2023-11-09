package com.scala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application //Companion class
object Application extends App {
  SpringApplication.run(classOf[Application]);
}
