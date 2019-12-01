package tour.of.scala.stringops

object StringOps extends App {
  val str: String = "Hello, i am learning scala"
  // All these ops are also available in Java, As Scala usage Java String class
  println(str.charAt(3))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println(str.toLowerCase())
  println(str.length)

  // Scala specific ops
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z') // +: = Prepending and :+ = Appending are scala ops
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators
  // S-interpolators
  val name = "Keshav"
  val age = 12
  val greeting = s"Hello, my name is $name and i am $age years old"
  val anotherGreeting = s"Hello, my name is $name and i will be turning ${age + 1} years old"
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minutes"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n new line")
  val escaped = "This is a \n new line"
  println(raw"$escaped")
}
