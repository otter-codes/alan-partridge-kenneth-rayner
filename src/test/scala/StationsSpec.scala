import org.scalatest.{MustMatchers, WordSpec}

class StationsSpec extends WordSpec with MustMatchers{

  "Stations" must {

    "return a string if none of the listed stations appear in the input" in {
      Stations.stopChecker(List("Newcastle")) mustEqual "No, seriously, run. You will miss it."
    }
    "return a string if all of the listed stations appear in the input" in {
      Stations.stopChecker(List("Rejection","Disappointment","Backstabbing Central","Shattered Dreams Parkway","Newcastle")) mustEqual "Smell my cheese you mother!"
    }
    "return a string if not all of the listed stations appear in the input" in {
      Stations.stopChecker(List("Disappointment","Backstabbing Central","Shattered Dreams Parkway","Newcastle")) mustEqual "No, seriously, run. You will miss it."
    }
    "return a string if not all of the listed stations appear in the input and one appears twice" in {
      Stations.stopChecker(List("Disappointment","Backstabbing Central","Shattered Dreams Parkway","Newcastle","Disappointment")) mustEqual "No, seriously, run. You will miss it."
    }

  }

}
