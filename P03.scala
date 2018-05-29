
object P03 extends App {
  def kth[T](k: Int, l: List[T]): T = k match {
    case 0 => l.head
    case _ => kth(k-1, l.tail)
  }

  println(kth(2, List(1,1,2,3,5,8)))
  println(kth(2, List("a","b","e","c","d","z")))
}
