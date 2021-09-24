trait ScalaTrait {
def printName()
}

trait Muuhammed {
  def printInfo() {
    println("Ahmed Essa")
  }
}

  class Mduuhammed extends Muuhammed with ScalaTrait{
 override def printInfo() {
    println("Ahmed Essa")
  }
    override def printName() {
      println("MUHAMMED Essa")
    }
  }

object ScalaTraitObject {
  def main(args:Array[String]){
    var c = new Mduuhammed()
    c.printInfo()
    c.printName()
  }
}