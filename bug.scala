```scala
class MyClass(val name: String) {
  def greet(): Unit = {
    println(s"Hello, my name is $name")
  }
}

object Main extends App {
  val myInstance = new MyClass("Alice")
  myInstance.greet()
  println(myInstance.name)
}
```