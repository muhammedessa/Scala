class ScalaMethodOverloading {

  def sum(x:Int,y:Int) {
    println(x+y)
  }
  def sum(x:Double,y:Double) {
    println(x+y)
  }
  def sum(x:Int,y:Int,z:Int) {
    println(x+y+z)
  }
}

object ScalaMethodOverloadingObject {
  def main(args:Array[String]){
    var myClass = new ScalaMethodOverloading()
    myClass.sum(1,2)
    myClass.sum(1,2,3)
    myClass.sum(1.0,2.0)
  }
}
