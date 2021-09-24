object ScalaIfStatement {

  def main(args:Array[String]) {

    var salary = 1000
    if(salary < 1000){
      println("Salary less than " + 1000)
    }else if(salary == 1000){
      println("Salary equal  " + 1000)
    }else{
      println("Salary greater than " + 1000)
    }

  }
}
