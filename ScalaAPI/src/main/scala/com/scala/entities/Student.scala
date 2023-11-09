package com.scala.entities

import jakarta.persistence.{Column, Entity, GeneratedValue, GenerationType, Id, Table}

import scala.beans.BeanProperty


//@BeanProperty annotation to instruct scala to generate the Java bean based getter and setter on the variables.

@Entity
@Table(name = "_student")
class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "stud_id")
  @BeanProperty var id: Long = _;

  @Column(name = "stud_roll_no", unique = true)
  @BeanProperty
  var rollNo: Long = _;

  @Column(name = "stud_name")
  @BeanProperty
  var name: String = _;

  @Column(name = "stud_age")
  @BeanProperty
  var age: Int = _;

}

//@Entity
//@Table(name = "_student")
//case class Student(
//                   @Id
//                   @GeneratedValue(strategy = GenerationType.AUTO)
//                   @Column(name = "stud_id")
//                   @BeanProperty
//                   var id: Long = 0,
//                   @Column(name = "stud_roll_no", unique = true)
//                   @BeanProperty
//                   var rollNo: Long,
//                   @Column(name = "stud_name")
//                   @BeanProperty
//                   var name: String,
//                   @Column(name = "stud_age")
//                   @BeanProperty
//                   var age: Int,
//
//                 )
