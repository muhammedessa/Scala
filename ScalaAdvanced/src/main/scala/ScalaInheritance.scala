class Student {
// final val id:Int=1000
  val id:Int=1000
  var name:String="muhammed"
  var age:Int=37
// final def typeInfo() {
  def typeInfo() {
    println(s"id : $id  and name : $name  and age : $age " )
  }
}

class Muhammed extends Student{
  var salary:Double=300.0
   override def typeInfo() {
    println(s"id : $id  and name : $name  and age : $age   and salary : $salary " )
  }
}


final class sami {
    def showInfo() {
    println(s"id y " )
  }
}

class Ahmed extends Muhammed {
  override val id:Int=3000
  override def typeInfo() {
    println(s"id : $id  and name : $name  and age : $age   and salary : $salary " )
  }
}

object ScalaInherObject {
  def main(args:Array[String]){
    var myClass = new Ahmed()
    myClass.name = "Thamir"
    println(myClass.name )
    myClass.typeInfo()
  }
}