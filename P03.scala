
object P03 extends App {
  def kth(k: Int, l: List[Int]): Int = {
    val size = l.size
    if (k < size) l(k) else l(size-1)
  }

  println(kth(2, List(1,1,2,3,5,8)))
}
