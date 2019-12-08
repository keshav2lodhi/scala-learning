package tour.of.scala.method.notations

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    //def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickName: String): Person = new Person(s"$name ($nickName)", favoriteMovie)

    def unary_! : String = s"$name, what the heck?!"

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and i like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = learns("Scala")
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
       marry + "the Rockstar" => new person "Marry (the Rockstar)"

    2. Add an age to the Person class
       Add unary + operator => new person with the age + 1
       +mary => mary with the age incrementer

    3. Add "learns" method in the Person class => "Mary learns Scala"
       Add a learnsScala method, calls learns method with "Scala"
       Use it in postfix notation

    4. Overload the apply method
       marry.apply(2) => "Marry watched Inception 2 times"
   */


  println((mary + "the Rockstar")())
  println((mary + "the Rockstar").apply())

  println((+mary).age)

  println(mary learnsScala)

  println(mary(2))

}
