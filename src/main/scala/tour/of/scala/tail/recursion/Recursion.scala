package tour.of.scala.tail.recursion

import scala.annotation.tailrec

object Recursion extends App {

  /** ******Factorial using recursion *********/
  /*def fact(n: Int): Int = {
    if(n <= 1) 1
    else{
      n * fact(n-1)
    }
  }
  println(fact(5))*/

  /** ******Tail recursion in scala *********/
  /*def fact(a: Int) = {
    @tailrec def factAgg(acc: BigInt, n: Int): BigInt = {
      if (n <= 1) acc
      else factAgg(n * acc, n - 1)
    }

    factAgg(1, a)
  }
  println(fact(5))*/

  /** ************Check no is prime using tailrec **************/
  /*def isPrime(n: Int): Boolean = {
    @tailrec def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(4))
  println(isPrime(37))*/

  /*def isPrime(n: Int) : Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeTailrec(n / 2, true)
  }
  println(isPrime(2003))*/

  /** ******Concatenate string n times using tailrec *********/
  /*@tailrec
  def concatenateTailrec(s: String, n: Int, accumulator: String): String = {
    if(n <= 0) accumulator
    else concatenateTailrec(s, n - 1, s + accumulator)
  }
  println(concatenateTailrec("Hello", 3, ""))*/

  /** ************Fibonacci no using recursion ************/
  /*def fibonacci(n: Int): Int =
    if(n <= 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  println(fibonacci(5))*/

  /** **********Fibonacci no using tail recursion ***********/
  def fibonacci(n: Int): Int = {
    @tailrec
    def fibTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibTailrec(i + 1, last + nextToLast, last)

    if (n <= 1) 1
    else fibTailrec(2, 1, 1)
  }
  println(fibonacci(8))

}
