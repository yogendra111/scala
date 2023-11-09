package com.start

class Student{
  var id:Int = 0;                         // All fields must be initialized
  var name:String = null;
}
class Employee(id:Int, name:String){     // Primary constructor
  def show():Unit = {
    println(id+" "+name)
  }
}
object SingletonObject{
  def hello():Unit = {
    println("Hello, This is Singleton Object")
  }
}

//case object and classes
case class CaseClass1(a: Int, b: Int);
case class CaseClass2(a: Int);

object classAndObject {

  def main(args: Array[String]): Unit = {

    // Object typically has two characteristics: State, Behavior
    var s = new Student() // Creating an object
    println(s.id + " " + s.name);
    var e = new Employee(1, "Rohan");
    e.show();

    // Singleton Object
    // declared by using object keyword instead by class.
    SingletonObject.hello();

    //  class with same name as singleton object, it is called companion class and the singleton object is called companion object.


    //caseclass
    callCase(CaseClass1(2, 6));
    callCase(CaseClass2(5));

  }

}
def callCase(f:Any) = f match
  case CaseClass1(f,g)=>println("a = "+f+" b ="+g)
  case CaseClass2(f)=>println("a = "+f)
