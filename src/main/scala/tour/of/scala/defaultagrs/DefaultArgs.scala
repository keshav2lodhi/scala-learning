package tour.of.scala.defaultagrs

object DefaultArgs extends App {

  //val fact5 = factTailrec(5, 1)
  val fact5 = factTailrec(5) // Use default arg

  /** *******Pass a default arg in fact function ***********/
  def factTailrec(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else factTailrec(n - 1, n * acc)

  println(fact5)

  /** ************Save picture example using default args **************/
  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture(width = 800)

  /*
    1. pass in every leading argument
    2. name the arguments
   */
  savePicture(width = 800, height = 900, format = "bmp")
}
