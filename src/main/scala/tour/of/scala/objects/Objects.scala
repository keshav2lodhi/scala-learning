package tour.of.scala.objects

object Objects extends App {

  // Scala does not have class-level functionality ("static")
  object Person { // type + it's only instance
    // "static" / "class" level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //def from(mother: Person, father: Person): Person = new Person("Bobbie")
    // factory methods
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  // COMPANION OBJECT in Scala
  class Person(val name: String) {
    // instance level functionality
  }

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE

  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john) // mary and john are not pointing to the same instance

  val person1 = Person
  val person2 = Person
  println(person1 == person2) // person1 and person2 are pointing to the same instance

  /*
    1. Often in practice we have factories method in Singleton objects
   */
  //val bobbie = Person.from(mary, john)
  //val bobbie = Person.apply(mary, john)
  val bobbie = Person(mary, john) // All are equivalent (Make singleton object callable like function using apply method)

  /*
    Scala Applications = Scala object with
    def main(args: Array[String]): Unit
   */
}
