case class ScalaCaseClasses(x:Int,y:Int)

object ScalaCaseClassesObject {

  def main(args:Array[String]){
    var sum = ScalaCaseClasses(2,3)
    println("X: " + sum.x)
    println("Y: " + sum.y)
  }
}