class ScalaThis {
  var id:Int=0
  var name:String=""
  var salary:Double=0.0
  def this(id:Int, name:String, salary:Double){
    this()
    this.id = id
    this.name = name
    this.salary = salary
  }
  def showInfo() {
    println(s" Your ID: $id and your Name: $name and Age: $salary")
  }
}


class Person(name:String,age:Int){
  def this(id:Int,age:Int, name:String, salary:Double){
    this(name,age)
    println(s" Your ID: $id and your Name: $name and age: $age and salary: $salary")
  }
}

object ScalaThisObject {
  def main(args:Array[String]){
    var myClass = new Person(1000,37,"Muhammed", 3000.0)

  }
}