object Partridge extends App {

  def checkForWord (inputArray:Array[String],searchFor:String):String = {

    if (inputArray.contains(searchFor)) {
      "Mine's a pint!"
    }else "Lynn I've pierced my foot on a spike"
  }
}
