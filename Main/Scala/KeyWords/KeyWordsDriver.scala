package KeyWords


/**
 * Created by Yamaan on 11/22/15.
 */
object KeyWordsDriver extends ImportantWords {
  def main(args: Array[String]): Unit ={
    val testString: String = " U.S. President Barack Obama toughened his rhetoric against ISIS at a weekend press" +
      " conference in Malaysia that concluded his nine-day trip abroad.The group responsible for the Paris terror attacks" +
      " is \"a bunch of killers with good social media,\" he said. \"They are dangerous and they've caused " +
      "great hardship to ... an overwhelming majority of people.\"\n\nThe ISIS terror threat \n63 photos: " +
      "The ISIS terror threat\nFBI director: We can't yet restrain ISIS on social media\n\nThe global " +
      "coalition formed to destroy ISIS \"will not relent,\" he vowed. \"We will not accept the idea " +
      "that terrorist assaults on restaurants and theaters and hotels are the new normal, or that we are" +
      " powerless to stop them.\"\n\nObama's stronger language on ISIS came after days of criticism for his" +
      " response to the tragedy in Paris but did not signal a policy shift by the administration.\n\n\"They can't" +
      " beat us on the battlefield, so they try to terrorize us into being afraid, and changing our patterns of behavior," +
      " and panicking, and abandoning our allies and partners, and retreating from the world,\" Obama said. \"As " +
      "president, I will not let that happen.\"\n\nObama seeks tricky balance in fight against ISIS\n\nIt's \"absolutely " +
      "false\" that \"we are somehow at war with an entire religion,\" he said. \"The United States could never be at" +
      " any war with any religion because America is made up by multiple religions. We're strengthened by people from " +
      "every religion, including Muslim Americans. So I want to be as clear as I can on this -- prejudice and discrimination " +
      "helps (ISIS) and undermines our national security.\"\n\nObama says ground troops to fight ISIS would be" +
      " a mistake\n\nObama was hit with a wave of criticism in the wake of the terrorists' attacks in France and " +
      "Lebanon, which left hundreds dead. At a press conference a few days after 130 people were slaughtered in" +
      " France's capital, Obama described that burst of violence as a \"setback\" in the battle against ISIS.\n\nNight" +
      " of terror: Paris attacks\n32 photos: Night of terror: Paris attacks\nWhy did Obama declare ISIS 'contained' " +
      "the day before the Paris attack?\n\nHe also addressed the backlash in the United States against accepting " +
      "Syrian refugees after it was widely reported that one of the Paris attackers may have entered France among " +
      "a group of refugees.\n\nThe Obama administration had said it wanted the U.S. to accept at least 10,000 Syrian" +
      " refugees in the next year.\n\nOn Thursday, the House swiftly passed a bill that would suspend the program allowing " +
      "Syrian and Iraqi refugees into the country until key national security agencies certify they don't pose a" +
      " security risk\n\nMore than half the nation's governors say Syrian refugees not welcome\n\n\"People have " +
      "understandably been so concerned, given how similar Paris is to many American cities, that I get why legislation" +
      " in the House moved forward quickly,\" Obama said Sunday. \"My hope though is, now that we have some time to catch" +
      " our breath and take a look at this carefully, that people understand that refugees who end up in the United States " +
      "are the most vetted, scrutinized, thoroughly investigated individuals that ever arrived on American " +
      "shores.\"\n\nObama calls caring for refugees 'American leadership\n\nThe process that has been \"constructed " +
      "over the course of several administrations, on a bipartisan basis, is extraordinarily thorough,\" he" +
      " said.\n\nIt already takes between 18 and 24 months for someone to be approved, he noted.\n\nThe legislation" +
      " that passed only \"gums up the works so much\" that \"effectively, you don't see any refugees being admitted.\""
    var stringArray = testString.replaceAll("[^a-zA-Z ]", "").toLowerCase.split("\\s+")
    stringArray = stringArray.filterNot(stopWords contains _)
    for(x <- 0 to stringArray.length) {
      //println(stringArray(x))
      //println("size of array: " + stringArray.length)
    }
    println(KeyWordsFinder.findKeyWordsString("Keywords: " + KeyWordsFinder.findKeyWordsString(testString).length))
  }
}
