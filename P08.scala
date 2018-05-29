

object P08 extends App {

  def compress[T](l: List[T]): List[T] = l match {
    case Nil => List()
    case a :: Nil => List(a)
    case a :: tail => {
      if (a == tail.head) compress(tail) else a :: compress(tail)
    }
  }

  val l = "aaaabccaadeeee".toList
  println(compress(l))

}
