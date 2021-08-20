//19000022
object Q1{
    def main(args:Array[String]):Unit = {
      val x = new Rational(9, 5)
      println(x.neg)

    }

}

class Rational(p: Int, q: Int) {
  def numer = p
  def denom = q

  def +(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
  def neg = new Rational(-this.numer,this.denom)
  def -(r:Rational) = this+r.neg

  override def toString = this.numer.toString + "\\" + this.denom.toString
}



