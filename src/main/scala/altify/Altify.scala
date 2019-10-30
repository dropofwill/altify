package altify

import outwatch.dom._
import outwatch.dom.dsl._
import monix.execution.Scheduler.Implicits.global

object Altify {
  def main(args: Array[String]): Unit = {

    OutWatch.renderInto("#app", h1("Hello World")).unsafeRunSync()
  }
}
