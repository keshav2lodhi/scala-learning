package exercises

abstract class MyList {
  /*
    1. head = first ele of the list
    2. tail = remainder of the list
    3. isEmpty = is this list empty
    4. add(int) => new list with this ele added
    5. toString => a string representation of the list
   */

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(ele: Int): MyList
  def printElement: String
  // polymorphic call
  override def toString: String = "[" + printElement + "]"
}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(ele: Int): MyList = new Cons(ele, Empty)
  def printElement: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(ele: Int): MyList = new Cons(ele, this)
  def printElement: String = {
    if(t.isEmpty) "" + h
    else h + " " + t.printElement
  }
}

object ListTest extends App {
  //val list = new Cons(1, Empty)
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.tail.tail.head)
  println(list.add(4).head)
  println(list.isEmpty)

  println(list.toString)
}