object Partridge extends App {

  def checkForWord(inputArray: Array[String]): String = {

    val words = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val numMatches = inputArray.count(x => words contains x)
    //val numMatches = words.intersect(inputArray).length
    if (numMatches == 0) {
      "Lynn, I've pierced my foot on a spike!!"
    }
    else {
      s"Mine's a pint${"!" * numMatches}"
    }
  }
}
