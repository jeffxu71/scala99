
object P02 extends App {
  def penultimate[T](l: List[T]): T = {
    l.reverse.tail.head
  }

  println(penultimate(List(1,1,2,3,5,8)))
  println(penultimate(List('a','b','c','d','e','f')))
}
