package tour.of.scala.implicits

object ScalaImplicit extends App {

  val value = 10
  implicit val multiplier = 3 // Compiler will look for if there is any implicit val available

  /** **********Implicit conversions ************/
  implicit def convert(a: Double): Int = a.toInt

  /** ***********Implicit parameters ************/
  def multiply(implicit by: Int) = value * by
  val result = multiply // implicit parameter passed here
  println(result)
  val res = multiply(2.0) // Type conversions with implicit functions
  println(res)
}
