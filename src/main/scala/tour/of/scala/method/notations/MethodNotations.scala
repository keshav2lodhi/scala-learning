package tour.of.scala.method.notations

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    //def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and i like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception")) // Both are equivalent
  /*****************************infix notation in Scala *********************************/
  println(mary likes "Inception") // infix notation or operator notation (is also called syntactic sugar): Are applicable if we have single parameter

  /*******************************"operators" in Scala **********************************/
  val tom = new Person("Tom", "Fight Club")

  //println(mary hangOutWith tom)
  println(mary + tom) // Replacing "hangOutWith" with "+" is still a valid method
  println(mary.+(tom)) // Both are equivalent

  // ALL OPERATORS ARE METHODS
  // Akka actors have !(tell) and ?(ask) operator as method
  println(1 + 2)
  println(1.+(2))

  /***********************************prefix in Scala **********************************/
  val x = -1 // Equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with +, -, ~, !

  println(!mary)
  println(mary.unary_!)

  /***********************************postfix in Scala **********************************/
  println(mary.isAlive)
  println(mary isAlive) // postfix operator notation is only available to methods without parameter

  /***********************************apply method in Scala **********************************/
  println(mary.apply)
  println(mary()) // Both are equivalent

  /*
    1. Overload the + operator
       marry + "the rockstar" => new person "Merry (the rockstar)"
   */



}
