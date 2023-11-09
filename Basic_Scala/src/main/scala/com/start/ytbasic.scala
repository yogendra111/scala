package com.start

object ytbasic extends App {

  //Int, Char, Boolean, Float, Double, String
  val mean: Int = 42; //const int mean = 42
  val isThat = false; //type is optional
//  println(mean);

  //String and its operations
  val aString = "Bro";
  val aComposedString = "I " + "am " + "";
  val aInterpolatedString = s"Hii, $aComposedString $aString";
  println(aInterpolatedString);

  //expression
  val sum = 2 + 3;
  val ifExp = if(mean==42) true else false // mean==42? true : false
  val blockExp = {
    val localVal = 32
    localVal + 3
  }

//  println(myfunc(sum, aInterpolatedString))
//  println(factorial(4))

  //functions
  //we can also change sequence of parameter by specifying the parameter name
  def myfunc(c: Int, y: String = "Hii"): String = y + " " + c;

  //recursive
  def factorial(x: Int): Int = {
    if (x<=1) 1
    else x * factorial(x-1)
  }

  functionExample(25, multiplyBy2)
  var result = multiplyBy2(add2(10))      // Function composition
  println(result)

  def functionExample(a: Int, f: Int => AnyVal): Unit = { //=> symbol denotes a function type in Scala.
    println(f(a)) // Calling that function
  }
  def multiplyBy2(a: Int): Int = {
    a * 2
  }
  def add2(i: Int): Int = {
    i + 2
  }

  //type: Unit - no meaningful value (i.e. void)
  //basically unit returns a ()

  // val sum: (Int, Int) => Int = (x, y) => x + y
  var result1 = (a: Int, b: Int) => a + b // Anonymous function by using => (rocket)
  var result2 = (_: Int) + (_: Int)

  println("anon" + result2(3, 5))

  def add(a: Int)(b: Int) = { // Function Currying
    a + b
  }
  print(add(10)(10))

}
