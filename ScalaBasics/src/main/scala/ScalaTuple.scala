object ScalaTuple {
  def main(args:Array[String])  {

    val myTuple = (100,2,3,4,5,6)
    val names = ("Muhammed", " Essa", " Hameed")
    val total = (1,2,3,4,5,6,"Muhammed", " Essa", " Hameed")

//    print(myTuple)
//    println()
//    print(names)
//    println()
//    print(total)
   // myTuple.productIterator.foreach(println)
    println(myTuple._1)
    print(myTuple._3)
  }
}
