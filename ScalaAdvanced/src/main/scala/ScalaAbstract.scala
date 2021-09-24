abstract class Animal {
   def run()
  def sleep()
  def eat()
  def name()
}



class Cat extends Animal{
  def sleep(){
println("`cat is sleeping")
  }
  def run(){
    println("cat is running")
  }

  def eat(){
    println("`cat is eating")
  }
  def name(){
    println("Cat")
  }
}


abstract class Human(age:Int) {
  var name:String="Human"
  def run()
  def eat()
  def sleep() {
    println("Human is sleeping")
  }
}


class Hassan(age:Int) extends Human(age:Int){
   name="Hassan"
  def run() {
    println(s"$name is running")
  }
  def eat() {
  }
}

object AnimalAbObject {
  def main(args:Array[String]){
    var c = new Hassan(36)
    c.run()
    c.sleep()
  }
}