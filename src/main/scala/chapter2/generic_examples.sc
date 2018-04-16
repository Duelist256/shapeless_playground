import shapeless.Generic

case class IceCream(name: String, numCherries: Int, inCone: Boolean)
val iceCreamGen = Generic[IceCream]

val iceCream = IceCream("Sundae", 1, false)

val repr = iceCreamGen.to(iceCream)

val iceCream2 = iceCreamGen.from(repr)

case class Employee(name: String, number: Int, manager: Boolean)
// Create an employee from an ice cream:
val employee = Generic[Employee].from(Generic[IceCream].to(iceCream))