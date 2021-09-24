class ScalaConstructor {
  println("Muhammed Essa" )
}

class ScalaPrimary(id:Int,name:String,age:Int) {
 def printInfo(){
   println(s" Your ID: $id and your Name: $name and Age: $age")
 }
}

class ScalaScondary(id:Int,name:String,age:Int) {
  var salary:Double=0.0
  def printInfo(){
    println(s"ID: $id & Name: $name & Age: $age & salary: $salary")
  }

  def this(id:Int,name:String,age:Int, salary:Double){
    this(id,name,age)
    this.salary = salary
  }
}


object ScalaConstructorObject {
  def main(args:Array[String]){
    var sum = new ScalaScondary(1000,"Muhammed",37)
    var sum2 = new ScalaScondary(1000,"Muhammed",37,434343.3)
     sum.printInfo()
    sum2.printInfo()
  }
}
