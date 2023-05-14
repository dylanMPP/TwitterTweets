package objsets

/**
 * The interface defining the methods of a TweetSet
 */
trait TweetSetInterface:
  def incl(tweet: Tweet): TweetSet
  def remove(tweet: Tweet): TweetSet
  def contains(tweet: Tweet): Boolean
  def foreach(f: Tweet => Unit): Unit
  def union(that: TweetSet): TweetSet
  def mostRetweeted: Tweet
  def descendingByRetweet: TweetList
