object PatterMatching {

  def main(args:Array[String]) {


    var num = 7000

    num match{
      case 1000 => println("1000")
      case 2000 => println("2000")
      case 3000 => println("3000")
      case 4000 => println("4000")
      case _ => println("unknown")
    }

  }
}
