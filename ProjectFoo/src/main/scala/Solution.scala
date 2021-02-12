object Solution {

  case class Message(s: String)

  def concat(one: Message, two: Message): Message = {
    Message(one.s + two.s)
  }
}

