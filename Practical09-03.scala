object StringFormatter {

  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))          
    println(formatNames("Niroshan") { name =>
      toUpper(name.substring(0, 2)) + toLower(name.substring(2))
    })                                             
    println(formatNames("Saman")(toLower))         
    println(formatNames("Kumara") { name =>
      toUpper(name.substring(0, 1)) + toLower(name.substring(1, name.length - 1)) + toUpper(name.substring(name.length - 1))
    })                                             
  }
}
