
object P01 extends App {
  def last(l: List[Int]): Int = {
    l.reverse.head
  }

  println(last(List(1,1,2,3,5,8)))
}
