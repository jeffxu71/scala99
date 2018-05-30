
import scala.annotation.tailrec

object P32 extends App {

  @tailrec
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }

  println(gcd(36, 63))
  println(gcd(63, 36))
}
