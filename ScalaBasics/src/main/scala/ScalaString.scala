object ScalaString {
  def main(args:Array[String])  {
    var name = "Muhammed Essa Hameed"

    name = name + " Ahmed"
    println("My name is: "+name)

    var name1 = "Muhammed"
    var name2 = " Essa "
    var name3 = " Essa "
//    println(name1 == name2)
//    println(name2 == name3)
//        println(name1.equals(name2) )
//        println(name2.equals(name3))
//    println(name1.compareTo(name2) )
//    println(name2.compareTo(name3))


//    println(name1.concat(name2) )
//    println(name2.concat(name3))

    println(name1.substring(1,4) )

    val age = 37
    val myName = "Muhammed essa"
    println(s"My age is: $age also my name is: $myName")
    println(f"My age is: $age also my name is: $myName")
  }
}
