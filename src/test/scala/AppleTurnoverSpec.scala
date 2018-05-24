import org.scalatest.{MustMatchers, WordSpec}

class AppleTurnoverSpec extends WordSpec with MustMatchers {


  "AppleTurnover" must {

    "Return a particular phrase if the input squared is greater than 2million degrees" in {
      AppleTurnover.convert(2000) mustBe "Hotter than the sun!"
    }
    "Return a particular phrase if the input squared is greater than 2million degrees and a different phrase if input squared is less than 2million  degrees" in {
      AppleTurnover.convert(1000) mustBe "Help yourself to a honeycomb Yorkie for the glovebox"
    }
  }
}
