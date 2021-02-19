

class Task {

  /*
    Q1: Create a class called Car. It should
    - have 3 constructor arguments: colour (string), topSpeed (integer) & make (string)
    - have a describe method that returns the string out "$colour $make with a top speed of $topSpeed"
    - has a private property called isClean, which is a Boolean, set to false
  */

  class Car(val colour: String,
            val topSpeed: Int,
            val make: String) {

    val isClean: Boolean = false

    def describe: String = s"$colour $make with a top speed of $topSpeed"

  }

  /*
    Q2: Create another class called CleanCar that extends Car and:
    - has all the same constructor arguments
    - overrides isClean to be true
    - overrides the describe method to return the string "A clean $colour $make"
   */

  class CleanCar(colour: String,
                 topSpeed: Int,
                 make: String) extends Car(colour, topSpeed, make) {

    override  val isClean: Boolean = true

    override def describe: String = s"A clean $colour $make"

  }

}

