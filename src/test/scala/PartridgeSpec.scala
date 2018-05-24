import org.scalatest._

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" must {

    "given and empty list return a String" in {
      Partridge.checkForWord(Array(""), "Partridge") mustEqual "Lynn I've pierced my foot on a spike"
    }

    "check whether an array of strings contains a particular word and return another string" in {
      Partridge.checkForWord (Array("Hello","Alan","Partridge"),"Partridge") mustEqual "Mine's a pint!"
    }
    "check whether an array of strings contains a particular word and return another string if it does not contain the word" in {
      Partridge.checkForWord (Array("Hello","Alan"),"Partridge") mustEqual "Lynn I've pierced my foot on a spike"
    }
    "if the input array of strings contains the particular word more than once increase the number of exclamation marks at the end of the returned string" in {
      Partridge.checkForWord(Array("Hello","Alan","Partridge","Partridge"), "Partridge") mustEqual  "Mine's a pint!!"
    }

  }

}
