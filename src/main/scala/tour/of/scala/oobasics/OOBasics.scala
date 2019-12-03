package tour.of.scala.oobasics

object OOBasics extends App {

  val person = new Person("Keshav", 20)
  println(person.age)
  person.greet("Giri")
  person.greet()

  val author = new Writer("Savi", "Sharma", 1950)
  val imposter = new Writer("Savi", "Sharma", 1950)
  val novel = new Novel("Everyone have a story", 2000, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print

}

// constructor
class Person(name: String, val age: Int = 0) {

  // body
  val x = 10
  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, i am $name")

  // multiple constructor
  def this(name: String) = this(name, 0)

  def this() = this("Dinesh") // Calling an auxiliary constructor
}

/*
  Novel and a Writer class

  Writer: first name, surname, year
   - method: fullname

  Novel: name, year of release, author
   - authorAge
   - isWrittenBy(author)
   - copy (new year of release) = new instance of novel
 */
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int value
    - method: current count
    - method to increment/decrement => new counter
    - overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter =
    if (n <= 0) this
    else inc.inc(n - 1)

  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n - 1)

  def print = println(count)
}