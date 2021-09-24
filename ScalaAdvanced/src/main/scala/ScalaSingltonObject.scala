object ScalaSingltonObject {

  def main(args:Array[String]){
    //MyObject.printInfo()
  //  var c = new ScalaSingltonObject()
   new ScalaSingltonObject().printInfo()
  }
}


class ScalaSingltonObject {
  def printInfo() {
    println("Ahmed Essa")
  }
}

object MyObject {
 def printInfo() {
   println("Muhammed Essa")
 }
}
