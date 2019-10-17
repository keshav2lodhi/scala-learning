package tour.of.scala.implicits

object ScalaImplicit extends App {
  implicit def convert(a: Double): Int = {
    println("inside this")
    a.toInt
  }

  val value = 10
  implicit val multiplier = 3
  //val res = multiply
  val res1 = multiply(2.0)

  def multiply(implicit by: Int) = value * by

  println(res1)
}
