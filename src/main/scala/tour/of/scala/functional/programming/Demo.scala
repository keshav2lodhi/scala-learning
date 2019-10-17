package tour.of.scala.functional.programming

object Demo extends App {
  def totalSelectValues(list: List[Int],
                        selector: Int => Boolean) = {
    var sum = 0
    list foreach { e =>
      if (selector(e)) sum += e
    }
    sum
  }

  println(totalSelectValues(List(1, 2, 3, 4, 5, 6), { e => true }))
  println(totalSelectValues(List(1, 2, 3, 4, 5, 6), { e => e % 2 == 0 }))
  println(totalSelectValues(List(1, 2, 3, 4, 5, 6), { e => e % 2 != 0 }))
}
