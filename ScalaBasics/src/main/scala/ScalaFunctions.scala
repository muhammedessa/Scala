import java.security.Policy.Parameters

object ScalaFunctions {

  def showInfo(){
    println("Hello Muhammed Essa")
  }

  def showResult():Int={
    var x = 10
    var y = 12
    x+y
  }
  def showResult2(x:Int,y:Int)={
    x+y
  }


  def showResult3(x:Int=1,y:Int=2)={
    x+y
  }

  def main(args:Array[String])  {
//    showInfo()
//    var someResult = showResult() + 1
//   println( someResult)
    println(showResult3())
    println(showResult3(3,4))
    println(showResult3(x=3,y=4))
    println(showResult3(y=3,x=4))
  }
}
