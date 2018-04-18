import org.scalatest.{MustMatchers, WordSpec}

class NthSmallestSpec extends WordSpec with MustMatchers {

  "NthSmallest" must {

    "return 4 when given the list 1,2,3,4,5 and the nth number is 2 (second largest num" in {
      NthSmallest.findNth(List(1,2,3,4,5),2) mustEqual 4
    }

    "return 3 when given the list 3,3,4,4,5,5 and the nth number is 3 (third largest num" in {
      NthSmallest.findNth(List(3,3,4,4,5,5),3) mustEqual 3
    }

    "return error when given the list 1,2 and the nth number is 3" in {
      intercept[IllegalArgumentException]{NthSmallest.findNth(List(1,2),3)
      }

    }
  }

}
