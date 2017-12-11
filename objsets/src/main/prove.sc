import objsets.{TweetReader, TweetSet}

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

/*object Zero extends Nat{
  def isZero = true
  def predecessor = throw new IllegalArgumentException("no natural nums before zero")
  def successor = new Succ(this)
  def + (that: Nat)
  def - (that: Nat)
}

class Succ(n: Nat) extends Nat{
  def isZero = false
  def
}*/


val google = List("android", "Android", "galaxy", "Galaxy", "nexus", "Nexus")
val apple = List("ios", "iOS", "iphone", "iPhone", "ipad", "iPad")

lazy val googleTweets: TweetSet = TweetReader.allTweets.filter(tw => google.exists(tw.text.contains(_)))
lazy val appleTweets: TweetSet = TweetReader.allTweets.filter(tw => apple.exists(tw.text.contains(_)))

appleTweets.foreach(tw=>println(tw.text))

googleTweets.foreach(tw=>println(tw.text))

googleTweets.union(appleTweets).descendingByRetweet.foreach(tw => println(tw.text))



