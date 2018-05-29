object Stations {

  def stopChecker (input: List[String]):String = {
    val stationsRequired = List("Rejection","Disappointment","Backstabbing Central","Shattered Dreams Parkway")

    val numMatches = stationsRequired.intersect(input)

    if (numMatches.toSet != stationsRequired.toSet){
      "No, seriously, run. You will miss it."
    }
    else {
      "Smell my cheese you mother!"
    }
  }
}

