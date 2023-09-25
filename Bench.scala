package p1

import org.openjdk.jmh.annotations.Benchmark

object Bench {
  val values: List[A] = (1 to 1000).map {
    n => Class.forName("p1.A$A" + (n % 100).toString).getConstructors.head.newInstance(n).asInstanceOf[A]
  }.toList
}

class Bench {

  @Benchmark
  def scalaMatch: Int = Bench.values.map(ScalaMatch.f).sum

  @Benchmark
  def javaSwitch: Int = Bench.values.map(JavaSwitch.f).sum

  @Benchmark
  def javaIfElse: Int = Bench.values.map(JavaIfElse.f).sum

}
