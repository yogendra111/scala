package com.scala.repositories

import com.scala.entities.Student
import org.springframework.data.jpa.repository.JpaRepository

trait StudentRepository extends JpaRepository[Student, Long]{

}
