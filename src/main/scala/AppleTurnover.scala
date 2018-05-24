object AppleTurnover {

  def convert (input:Any):String = {

    val inputToInt = input.toString.toInt
    if  (inputToInt * inputToInt >= 2000000){
      "Hotter than the sun!"
    } else "Help yourself to a honeycomb Yorkie for the glovebox"
  }

}
