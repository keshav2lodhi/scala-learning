package tour.of.scala.inheritance.traits

object Inheritance extends App {

  // Scala offers single class inheritance
  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("From crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  /************************ Constructors **************************/
  class Person(name: String, age: Int) {  // Primary constructor
    // An auxiliary constructor
    def this(name: String) = this(name, 0)
  }

  // While extending a class JVM has to call a parent constructor first
  //class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
  class Adult(name: String, age: Int, idCard: String) extends Person(name) // Both are the correct ways

  /**************************** Overriding *****************************/
  class Dog(override val creatureType :String) extends Animal {
    //override val creatureType = "domestic"
    override def eat: Unit = {
      super.eat // Use of super in inheritance
      println("From dog class")
    }
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  /***************** type substitution (broad: polymorphism) ********************/
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat // A method call will always go to the most overridden version whenever possible

  // overRIDING vs overLOADING
  // super

  // Preventing overrides
  /*
    1. use final on members
    2. use final on entire class
    3. seal the class = extend classes in this file only, but prevent extension in other class
   */

}
