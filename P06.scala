
object P06 extends App {
  def isPalindrome(l: List[Int]): Boolean = {
    val half: Int = l.size / 2
    val firstHalf = l.slice(0, half)
    val secondHalf = l.slice(half+1*(if(l.size % 2 ==0) 0 else 1), l.size)
    //print(firstHalf)
    //print(secondHalf)
    if (firstHalf == secondHalf.reverse) true else false
  }

  println(isPalindrome(List(1,2,3,2,1)))
}

