object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    print("Please enter an integer: ")

    try {
      val input = scala.io.StdIn.readInt()

      val checkNumber: Int => String = (num: Int) => num match {
        case n if n < 0 => "Negative number"
        case n if n == 0 => "Zero"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }

      println(checkNumber(input))
    } catch {
      case _: NumberFormatException => println("Please provide a valid integer.")
    }
  }
}
