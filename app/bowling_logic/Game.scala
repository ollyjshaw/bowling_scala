package bowling_logic

class Game {

  var count = 0

  def roll(i: Int) {
    count += i
  }

  def score(): Int = {
    count
  }

}
