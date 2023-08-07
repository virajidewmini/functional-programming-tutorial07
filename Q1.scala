import scala.io.StdIn.readLine
object Q1 {
  def main(args: Array[String]): Unit = {
    def filterEvenNumbers(numberList :List[Int]): List[Int] ={
      numberList.filter(number =>number%2==0)
    }

    println("Enter a list of integers separated by commas:")
    val input = readLine()
    val numberList = input.split(",").map(_.toInt).toList
    println(filterEvenNumbers(numberList))


  }
}
