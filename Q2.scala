import scala.io.StdIn.readLine

object Q2 {
  def main(args: Array[String]): Unit = {
    def calculateSquare(numberList :List[Int]): List[Int] ={
      numberList.map(number=> number*number)
    }

    println("Enter a list of integers separated by commas:")
    val input = readLine()
    val numberList = input.split(",").map(_.toInt).toList
    println(calculateSquare(numberList))
  }
}
