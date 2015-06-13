object Main {
  def main(args: Array[String]) = {
    val hello = "hello scala"
    println(hello)

    val hello2: String = "hello!"
    println(hello2)
    //hello2 = "bad"

    var hello3 = "hello 3!"
    println(hello3)
    hello3 = "changed hello3"
    println(hello3)

    //hello3 = 100
    var hello4: Any = "hello4!"
    println(hello4)
    hello4 = 100
    println(hello4)
  }
}
