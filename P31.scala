

object P31 extends App {

  def isPrime(n: Int): Boolean = n match {
    case 1 => true
    case _ => (2 to math.sqrt(n).toInt) forall (n % _ != 0)
  }

  println("1: " + isPrime(1))
  println("7: " + isPrime(7))
  println("9: " + isPrime(9))
  println("15: " + isPrime(15))
}
