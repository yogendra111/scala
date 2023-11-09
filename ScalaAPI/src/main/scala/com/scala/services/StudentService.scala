package com.scala.services

import com.scala.entities.Student

trait StudentService {
//  def saveStudent(studentModel: StudentModel): StudentModel;
  def saveStudent(student: Student): Student;
  def getStudent(id: Long): Student;
  def getAllStudents(): Any
  def deleteStudent(id: Long): Boolean;
  def updateStudent(id: Long, student: Student): Student;
}
