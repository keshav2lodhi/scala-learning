package tour.of.scala.apply.unapply

/**
 * apply and upapply methods in scala
 *
 **/
object Twice {
  def apply(x: Int): Int = x * 4

  def unapply(z: Int): Option[Int] = {
    println("Z from int: " + z)
    if (z % 2 == 0) {
      println("From if")
      Some(z / 2)
    } else {
      println("From else")
      None
    }
  }
}

object TwiceTest extends App {
  val x = Twice(21)
  println(x)
  x match {
    case Twice(nn) => println(nn)
    //case xx @ Twice(n)  => println("dfd"+xx)
    //case pp => println("default : " + pp)
  }
}
