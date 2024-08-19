object InterestCalculator {

  def main(args: Array[String]): Unit = {
    val depositAmounts = List(15000, 100000, 500000, 2500000)
    depositAmounts.foreach { amount =>
      println(s"Deposit: Rs. $amount, Interest: Rs. ${calculateInterest(amount)}")
    }
  }

  val calculateInterest: Double => Double = (deposit: Double) => deposit match {
    case d if d <= 20000    => d * 0.02
    case d if d <= 200000   => d * 0.04
    case d if d <= 2000000  => d * 0.035
    case d if d > 2000000   => d * 0.065
  }
}
