
object P15 extends App {

  private def dupN[T](n: Int, t: T): List[T] = {
    var l: List[T] = List[T]()
    for (i <- 1 to n) l = l :+ t
    l
  }

  def duplicateN[T](n: Int, l: List[T]): List[T] = l match {
    case Nil => Nil
    case a :: Nil => dupN(n, a) ::: Nil
    case a :: tail => dupN(n, a) ::: duplicateN(n, tail)
  }

  val n: Int = 4
  val l = "12345".toList
  println(duplicateN(n, l))
}
