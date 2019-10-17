package tour.of.scala.traits

trait Friend {
  val name: String

  def listen = println("I am " + name + " your friend")
}

class Human(val name: String) extends Friend

class Animal(val name: String)

class Dog(override val name: String) extends Animal(name) with Friend

class Cat(override val name: String) extends Animal(name)

/*with trait.Friend*/

object Solution {
  def main(args: Array[String]): Unit = {
    val keshav = new Human("Keshav")
    //keshav.listen
    seekHelp(keshav)

    val lodhi = new Dog("Lodhi")
    //lodhi.listen
    seekHelp(lodhi)

    val pussi = new Cat("Pussi") with Friend
    //pussi.listen
    seekHelp(pussi)
  }

  def seekHelp(friend: Friend) = friend.listen
}