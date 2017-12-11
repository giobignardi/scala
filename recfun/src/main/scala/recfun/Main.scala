package recfun

import java.security.KeyStore.TrustedCertificateEntry

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if((c==0)||(c==r))1
      else pascal(c-1,r-1)+pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def loop(accu: Int,charsLeft:List[Char]):Int=
        if ((accu<0)||charsLeft.isEmpty) accu
        else if (charsLeft.head=="(".head) loop(accu+1, charsLeft.tail)
        else if(charsLeft.head==")".head) loop(accu-1, charsLeft.tail)
        else loop(accu, charsLeft.tail)
      loop(0,chars)==0
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if ((money < 0) || ((money > 0) & coins.isEmpty)) 0
      else if (money == 0) 1
      else countChange(money-coins.head, coins) + countChange(money, coins.tail)
    }
  }
