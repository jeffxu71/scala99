
object P07 extends App {
  def flatten(l: List[Any]): List[Any] = {
    List(1,1)
  }

  println(flatten(List(List(1,1), 2, List(3, List(5, 8)))))
}
