import scala.io.StdIn

object Main {
    def main(args: Array[String]): Unit = {
        val args = StdIn.readLine().toInt
        for (i <- 1 until args; j <- 1 until args)
            if (BigInt(i).gcd(BigInt(j)) == 1) {
                println(s"$i $j")
            }
    }
}
