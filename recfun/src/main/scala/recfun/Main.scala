package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    //    for (row <- 0 to 10) {
    //      for (col <- 0 to row)
    //        print(pascal(col, row) + " ")
    //      println()
    //    }
    for {
      row <- 0 to 10
      col <- 0 to row
    } yield {
      print(pascal(col, row) + " ")
      if (col == row) println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    def pascalInternal(c: Int, r: Int): Int = {

      if (c == 0 || r == 0 || c == r) 1
      else pascalInternal(c - 1, r - 1) + pascalInternal(c, r - 1)
    }

    pascalInternal(c, r)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = true

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = 3
}
