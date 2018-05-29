
object P14 extends App {

  def duplicate[T](l: List[T]): List[T] = l match {
    case Nil => Nil
    case a :: Nil => a :: a :: Nil
    case a :: tail => a :: a :: duplicate(tail)
  }

  val l = "abccd".toList
  println(duplicate(l))
}
