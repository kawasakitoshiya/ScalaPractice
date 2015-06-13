
//definition
class Player01 {
  val name = "Alice"
  var hp = 999
}

class Player02 {
  val name = "Bob"
  private var hp = 1029
}

//construnctor
class Player03(val _name: String, _hp: Int) {
  val name = _name
  private var hp = _hp
}

class Player04(val name: String, private var hp: Int = 10)

//method
class Player05(val name: String, private var hp: Int = 100) {
  //def attack_message_only(otherPlayer: Player05): Unit = println(name + " attacked " + otherPlayer.name)
  def attack(otherPlayer: Player05, damage: Int): Unit = {
    println(name + " attacked " + otherPlayer.name)
    otherPlayer.damaged(damage)
  }
  def damaged(damage: Int) = {
    println(name + " lost hp " + damage)
    hp = if(hp - damage < 0) { 0 } else {hp - damage}
    if (isDead) {println(name + " is dead")}

  }
  private def isDead: Boolean = hp <= 0
}

// TODO: sigleton
// object Player06 {
//   val defaultPlayerName = "defaultMan"
//   def createDefaultPlayer = new Player05(defaultPlayerName)
// }


object Main {
  def main(args: Array[String]) = {
    val alice = new Player01
    println(alice.name)
    println(alice.hp)

    val bob = new Player02
    println(bob.name)
    //println(bob.hp)
    //bob.hp = 99

    val charles = new Player03("charles", 88)
    println(charles.name)
    //println(charles.hp)

    val deen = new Player04("deen")
    println(deen.name)
    //println(deen.hp)

    val eric = new Player05("eric")
    val foo = new Player05("foo")
    eric.attack(foo, 20)
    eric.attack(foo, 100)

    // TODO singleton
    //val gool = Player06.defaultPlayer

  }
}
