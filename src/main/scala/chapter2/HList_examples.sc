import shapeless.{HList, ::, HNil}

val product: String :: Int :: Boolean :: HNil =
  "Sunday" :: 1 :: false :: HNil

product.head
product.tail.head
product.tail.tail.head
product.tail
product.tail.tail
// product.tail.tail.tail.head // compile error

val newProduct: ::[Long, ::[String, ::[Int, ::[Boolean, HNil]]]] = 42L :: product