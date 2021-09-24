object ScalaAssignmentOperator {
  def main(args:Array[String])  {
    var num1 = 1
    var num2 = 2

    var sum = num1+num2

  //  num2 += num1
    num2 -= num1
    num2 *= num1
    num2 /= num1
    num2 %= num1
    println(num2)
  }
}
