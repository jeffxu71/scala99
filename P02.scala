
object P02 extends App {
  def penultimate(l: List[Int]): Int = {
    l.reverse.tail.head
  }

  println(penultimate(List(1,1,2,3,5,8)))
}
