import scala.annotation.tailrec
//package problems.and.solutions

object Solutions extends App {
  /** **********Find distinct ele in an array *************/
  /*//args.distinct.foreach(x => printf(x + " "))
  args.foldLeft(Array[String]()) { (acc, ele) =>
    if (acc.contains(ele)) acc else acc :+ ele
  }.foreach(x => printf(x + " "))*/


  /** map, filter, flatMap, flatten **/
  /*val list = List(1,2,3)
  val map = Map(1 -> "Keshav", 2 -> "Lodhi")

  list.map(x=> println(x * 2)) //It will give a new list but not going to modify existing list

  val listOfList = List(List(1,6,3), List(4,5,2)).flatten
  println(listOfList)

  val listOfListFlat = List(List(1,6,3), List(4,5,2))
  println(listOfListFlat.flatMap(x=> x))

  println(list.filter(x=> x%2 == 0))*/
}
