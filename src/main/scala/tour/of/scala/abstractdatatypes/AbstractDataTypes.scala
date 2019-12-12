package tour.of.scala.abstractdatatypes

object AbstractDataTypes extends App {

  /******************* Abstract class *******************/
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine!"
    // Even if don't use override, compiler will understand that it is overriding the parent class method
    def eat: Unit = println("crunch crunch!!")
  }

  /*********************** Traits *************************/
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I am croc and i am eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  /*
    1. Both Abstract and Trait can have abstract and non-abstract members
    2. Traits do not have constructor parameters
    3. We can extend(inherit) only one class but multiple traits by the same class
    4. traits = "behaviour" and abstract class = "thing"
   */

}
