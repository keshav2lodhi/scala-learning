package tour.of.scala.CBNvsCBV

object CBNvsCBV extends App {

  /** ******Call be value and call be name ********/
  def calledByValue(x: Long): Unit = {
    println("Call by value: " + x)
    println("Call by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("Call by name: " + x)
    println("Call by name: " + x)
  }

  calledByName(System.nanoTime())
  calledByValue(System.nanoTime())

  /** **********Call by name proof *************/
  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34)
  printFirst(34, infinite()) // Call by name delays the execution of expression passed. Here not getting error b'coz the param y never used

}
