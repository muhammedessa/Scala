trait Employee {
def printInfo()
}

abstract class Department extends Employee{
  protected var salary:Double= 3007
  private var age:Int= 37
  def printDepartmentInfo()
}

class Samir extends Department {

  salary = 7000
  override def printDepartmentInfo() {
    println("printDepartmentInfo Essa")
  }

  override def printInfo() {
    println("printInfo Essa")
  }
}


//object ScalaThissObject  {
//  def main(args:Array[String]){
//    var myClass = new Samir()
//    myClass.printInfo()
//    myClass.salary = 40
//    println(myClass.salary)
//    myClass.printDepartmentInfo()
//  }}