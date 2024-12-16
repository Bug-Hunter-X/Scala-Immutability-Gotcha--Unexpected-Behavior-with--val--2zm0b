```scala
class MyClass(val name: String) {
  def greet(): Unit = {
    println(s"Hello, my name is $name")
  }
}

object Main extends App {
  val myInstance = new MyClass("Alice")
  myInstance.greet() // This will work correctly
  println(myInstance.name) // This will correctly print the immutable value

  // Example demonstrating the correct way to modify the behavior if mutable state is needed.
  class MutableMyClass(var name: String) {
    def greet(): Unit = {
      println(s"Hello, my name is $name")
    }
    def changeName(newName: String) = name = newName
  }

  val mutableInstance = new MutableMyClass("Bob")
  mutableInstance.greet()
  mutableInstance.changeName("Charlie")
  mutableInstance.greet()
}
```