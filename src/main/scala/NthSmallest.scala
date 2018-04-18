object NthSmallest extends App {

  def findNth(input: List[Int], n : Int) : Int = {

    n match {
      case n if n <= input.length => input.distinct.sorted.reverse(n-1)
      case _ => throw new IllegalArgumentException("Wrong numbers used")
    }

  }

}
