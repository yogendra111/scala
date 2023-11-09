package com.scala.controllers

import com.scala.entities.Student
import com.scala.models.StudentModel
import com.scala.services.StudentServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{DeleteMapping, GetMapping, PatchMapping, PathVariable, PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/api"))
class StudentController @Autowired()(studentService: StudentServiceImpl){

  @PostMapping(path = Array("/student"))
  def addStudent(@RequestBody student: Student): ResponseEntity[Student] = {
    ResponseEntity.ok().body(studentService.saveStudent(student));
  }

  @GetMapping(path = Array("/student/{id}"))
  def getStudent(@PathVariable id: Long): ResponseEntity[Student] = {
    ResponseEntity.ok().body(studentService.getStudent(id));
  }

  @GetMapping(path = Array("/student"))
  def getAllStudent(): ResponseEntity[Any] = {
    ResponseEntity.ok().body(studentService.getAllStudents());
  }

  @DeleteMapping(path = Array("/student/{id}"))
  def deleteStudent(@PathVariable id: Long): ResponseEntity[Boolean] = {
    ResponseEntity.ok().body(studentService.deleteStudent(id));
  }

  @PatchMapping(path = Array("/student/{id}"))
  def updateStudent(@PathVariable id: Long, @RequestBody student: Student): ResponseEntity[Student] = {
    ResponseEntity.ok().body(studentService.updateStudent(id, student));
  }

}
