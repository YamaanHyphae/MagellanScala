package KeyWords

/**
 * Created by Yamaan on 11/20/15.
 * we've were weren't what what's when when's where where's which while who who's whom why why's with won't would
 * wouldn't you you'd you'll you're you've your yours yourself yourselves
 */
trait ImportantWords {
  val stopWords: Vector[String] = Vector("a", "about", "above", "after", "again", "against", "all", "am", "an", "and",
    "any", "aren't",  "as", "at", "be", "because", "been", "before", "being", "below", "between", "both", "but", "by",
    "can't", "cannot", "could", "Could", "couldn't", "Couldn't", "did", "Did", "didn't", "do", "does", "doesn't", "doing",
    "down", "during", "During", "each", "few", "for", "from", "From","further", "Further", "had", "hadn't", "has", "hasn't",
    "have", "haven't", "having", "he", "He", "he'd", "he'll", "he's", "her", "Her", "here", "Here", "here's", "hers",
    "herself", "him", "himself", "his", "how", "how's", "I", "I'd", "i'd", "I'll", "i'll", "I'm", "i'm", "I've", "i've",
    "if", "If", "in", "into", "is", "isn't", "it", "it's", "its", "itself", "let's", "me", "more", "most", "mustn't",
    "my", "myself", "no", "nor", "not", "of", "off", "on", "once", "only", "or", "other", "ought", "our", "ours",
    "ourselves", "out", "over", "own", "same", "shan't", "she", "she'd", "she'll", "she's", "should", "shouldn't",
    "so", "some", "such", "than", "that's", "the", "their", "theirs", "them", "themselves", "then", "there", "there's",
    "these", "they", "they'd", "they'll", "they're", "they've", "this", "those", "through", "to", "too", "under", "until",
    "up", "very", "was", "wasn't", "we", "we'd", "we'll", "we're", "we've", "were", "weren't", "what", "what's", "when",
    "when's", "where", "where's", "while", "who", "who's", "whom", "why", "why's", "with", "won't", "would", "wouldn't",
    "you", "you'd", "you'll", "you're", "your", "yours", "yourself", "yourselves")

  val months: Vector[String] = Vector("January", "February", "March", "April", "May", "June", "July", "August",
    "September", "October", "November", "December")
}
