//19000022
object Q2{
    def main(args:Array[String]):Unit = {
      val x = new Rational(3, 4)
      val y = new Rational(5, 8)
      val z = new Rational(2, 7)
      println(x.sub(y).sub(z))

    }

}


class Rational(p: Int, q: Int) {
def numer = p
def denom = q

def sub(r: Rational) =new Rational(numer * r.denom - r.numer * denom, denom * r.denom)

override def toString = this.numer.toString + "\\" + this.denom.toString
}