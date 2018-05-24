import org.scalatest.{MustMatchers, WordSpec}

class AppleTurnoverSpec extends WordSpec with MustMatchers {


  "AppleTurnover" must {

    "Return a particular phrase if the input squared is greater than 1000 degrees" in {
      AppleTurnover.convert(2000) mustBe "Hotter than the sun!"
    }
    "Return a particular phrase if the input squared is greater than 1000 degrees and a different phrase if input squared is less than 2million  degrees" in {
      AppleTurnover.convert(10) mustBe "Help yourself to a honeycomb Yorkie for the glovebox"
    }
    "Return a particular phrase if the input is 31 or less" in {
      AppleTurnover.convert(31) mustBe "Help yourself to a honeycomb Yorkie for the glovebox"
    }
    "Return a particular phrase if the input is greater or equal to 32" in {
      AppleTurnover.convert(32) mustBe "Hotter than the sun!"
    }
  }
}
