object AppleTurnover {

  def convert (input:Any):String = {

    val inputToInt = input.toString.toInt
    if  (inputToInt * inputToInt >= 1000){
      "Hotter than the sun!"
    } else "Help yourself to a honeycomb Yorkie for the glovebox"
  }

}
