import shapeless.Generic

sealed trait Shape
final case class Rectangle(width: Double, height: Double) extends Shape
final case class Circle(radius: Double) extends Shape

val gen = Generic[Shape]

val rectRepr = gen.to(Rectangle(3.0, 4.0))

var circleRepr = gen.to(Circle(1.0))

gen.from(rectRepr)
gen.from(circleRepr)