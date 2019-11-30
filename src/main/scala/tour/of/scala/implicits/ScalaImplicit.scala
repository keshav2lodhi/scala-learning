package tour.of.scala.implicits

object ScalaImplicit extends App {

  /** *********Implicit conversions ************/
  implicit def convert(a: Double): Int = a.toInt
  implicit val multiplier = 3
  def multiply(implicit by: Int) = value * by

  /** *********Implicit parameters ************/
  val value = 10
  println(result)
  val result = multiply // implicit parameter passed here
  val res = multiply(2.0) // Type conversions with implicit functions
  println(res)
}
