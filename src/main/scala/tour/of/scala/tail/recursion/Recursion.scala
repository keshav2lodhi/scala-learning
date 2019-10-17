package tour.of.scala.tail.recursion

import scala.annotation.tailrec

object Recursion extends App {

  /**
   * Recursion in scala
   *
   **/
  /*def fact(n: Int): Int = {
    if(n <= 1) 1
    else{
      n * fact(n-1)
    }
  }
  println(fact(5))*/

  /**
   * Tail recursion in scala
   *
   **/
  def fact(a: Int) = {
    @tailrec def factAgg(acc: BigInt, n: Int): BigInt = {
      if (n <= 1) acc
      else factAgg(n * acc, n - 1)
    }

    factAgg(1, a)
  }

  println(fact(5))

}
