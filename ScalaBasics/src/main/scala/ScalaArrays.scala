object ScalaArrays {
  def main(args:Array[String])  {

    var myArray = Array(1,2,3,4,5,6,7,8)
    for(x <- myArray){
      println(x)
    }

    var mySecond = new Array[String](3)
    mySecond(0) = "Muhammed"
    mySecond(1) = "Essa"
    mySecond(2) = "Hameed"
//    for(x <- mySecond){
//      println(x)
//    }
 //   println(mySecond(0))
   // mySecond.foreach(println)
    mySecond.foreach(
      (element:String)=>println(element)
    )
  }
}
