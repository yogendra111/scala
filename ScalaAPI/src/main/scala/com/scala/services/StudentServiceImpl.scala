package com.scala.services

import com.scala.entities.Student
import com.scala.models.{Mapper, StudentModel}
import com.scala.repositories.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import scala.jdk.CollectionConverters._

@Service
class StudentServiceImpl @Autowired()(studentRepository: StudentRepository) extends StudentService {

  override def saveStudent(student: Student): Student = {
    //    var student = Mapper.convertModelToEntity(studentModel);
    //    Mapper.convertEntityToModel(studentRepository.save(student));
    studentRepository.save(student)
  }

  override def getStudent(id: Long): Student = {
    studentRepository.findById(id).get()
  }

  override def getAllStudents() = {
    //    studentRepository.findAll().asScala.toList
    studentRepository.findAll()
  }

  override def deleteStudent(id: Long): Boolean = {
    if (studentRepository.existsById(id)) {
      var student = studentRepository.findById(id).get()
      studentRepository.delete(student)
      true
    } else {
      false
    }
  }

  override def updateStudent(id: Long, student: Student): Student = {
    if (studentRepository.existsById(id)) {
      var oldStudent = studentRepository.findById(id).get()
      oldStudent.name = student.name
      oldStudent.age = student.age
      oldStudent.rollNo = student.rollNo
      studentRepository.save(oldStudent)
    } else {
      new Student()
    }
  }

}
