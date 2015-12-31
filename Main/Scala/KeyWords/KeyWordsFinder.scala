package KeyWords

/**
 * Created by Yamaan on 11/2/15.
 * This object is called upon by crawler to find keywords in String that is found.
 * Algorithm would work by taking string then input then making a vector of tuples of (int, string)
 * the tuple would include the word and the frequency of it showing up.
 *
 */
object KeyWordsFinder extends ImportantWords{

  /**
   * This method is the actual algorithm. It takes the string, breaks it into an array then filters out the stopwords
   * It then creates new lists, iterates through the entire array of strings and counts the frequency.
   * It the calls onto rank to give return the most common words in the string and then creates anther list that
   * @param string
   * @return
   */
  def findKeyWordsString(string: String): Vector[String] ={
    val arrayStrings = string.replaceAll("[^a-zA-Z ]", "").toLowerCase.split("\\s+")
    val filterArray = arrayStrings.filterNot(stopWords contains _)
    var stringList: List[String] = List()
    var intList: List[Int] = List()
    var x = 0
    while (x < filterArray.length){
      if(stringList.contains(filterArray(x))){
        val k = stringList.indexOf(filterArray(x))
        intList.patch(k, Seq(5), intList(x) + 1)
      } else{
        stringList = stringList :+ filterArray(x)
        intList = intList :+ 1
      }
      x+=1
    }
    val rankedList = this.rank(intList)
    var y = 0
    var returnVector: Vector[String] = Vector()
    while(y < rankedList.length) {
      returnVector = returnVector :+ stringList(rankedList(y))
      y += 1
    }
    returnVector
  }

  private def rank(intList: List[Int]): Vector[Int] ={
    var x = 0
    val freqReq: Int = (intList.length / 100)
    var returnVector: Vector[Int] = Vector()
    while(x < intList.length){
      if(intList(x) >= freqReq)
        returnVector = returnVector :+ x
      x += 1
    }
    returnVector
  }

  def findKeyWordsFile(file: String): Vector[String] ={
    val lines = scala.io.Source.fromFile(file).mkString
    findKeyWordsString(lines)
  }
}
