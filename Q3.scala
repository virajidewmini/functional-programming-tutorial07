import scala.io.StdIn.readLine

object Q3 {
  def main(args: Array[String]): Unit = {
    def isPrime(number :Int): Boolean ={
      var temp=0

      for( i<-2 to number/2){
        if(number%i==0){
          temp+=1
        }
      }

      if(temp==0 && number!=1){
        return true
      }else{
        return false
      }

    }

    def filterPrime(numberList: List[Int]): List[Int] ={
      numberList.filter(number => isPrime(number))
    }

    println("Enter a list of integers separated by commas:")
    val input = readLine()
    val numberList = input.split(",").map(_.toInt).toList
   println(filterPrime(numberList))

  }
}
