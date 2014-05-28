package bowling_logic

import org.scalatest._


class BowlingTest extends FlatSpec with Matchers {

  "A game " should "be created" in {
    val game = new Game()
  }

  it should "count 0 in a gutter game" in {
    val game = new Game()

    for (i <- 1 to 20) {
      game.roll(0)
    }

    game.score shouldBe 0
  }

  it should "count 20 when a single pin is hit per roll" in {
    val game = new Game()

    for (i <- 1 to 20) {
      game.roll(1)
    }

    game.score shouldBe 20
  }

  //test one spare (5,5,3, 17*0) score=16

  //test one strike (10, 3, 4,  16*0) score = 24

}