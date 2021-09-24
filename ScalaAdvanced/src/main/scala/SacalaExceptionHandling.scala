import javax.naming.InvalidNameException

class SacalaExceptionHandling {

  def results(x:Int,y:Int)  ={
    try {
      x/y
    }catch {
      case e:ArithmeticException => println(e)
    }finally {
      println("finally  ")
    }

    println("Muhammed Essa")
  }

  def checkStatus(id:Int)  ={
    if(id< 10){
       throw new ArithmeticException("you are not allowed")
    //  println("you are not allowed")
    }else{
      println(" You are admin")
    }
  }

  @throws(classOf[InvalidNameException])
  def checkName(name:String): Unit ={
    if(name == "Muhammed"){
      throw new InvalidNameException("you are not Muhammed")
    }else{
      println(" You are not Muhammed")
    }
  }
}

object SacalaExceptionHandlingObject  {
  def main(args:Array[String]){
    var e = new SacalaExceptionHandling()
//    e.results(4,0)
//    e.checkStatus(4)
    e.checkName("Muhammed")
  }}