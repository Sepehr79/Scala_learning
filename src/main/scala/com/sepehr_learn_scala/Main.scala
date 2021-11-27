package com.sepehr_learn_scala

import java.util

@main def main() = {
  val name: String = "sepehr";
  val lastName: String = "mollaei";
  print(s"Hello ${name} ${lastName}")

  val string ="""
    |hello world
    |my name is sepehr
  """.stripMargin
  print(string)

  val specialString = """Hello world
    my name is sepehr mollaei.
      """.toString
  print(specialString)


  // Lists
  val myList = List(1, 6, 5, 5, 4)

  for i <- myList do println(i)

  val power2 = for i <- List.range(1, 11) yield i * i;
  print(power2)

  name match {
    case "sepehr" => print(name)
    case "ahmad" => print(s"sepehr ${name}")
  }


}

