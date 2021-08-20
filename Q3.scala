//19000022
object Q3{
    def main(args:Array[String]):Unit = {
      val acc1 = new Account("110", 20, 1000)
      val acc2 = new Account("220", 25, 900)

      println("Before Transfer")
      println(acc1)
      println(acc2)

      println()
      acc1.transfer(acc2, 100)

      println("After Transfer")
      println(acc1)
      println(acc2)
    }

}



class Account(id:String,n: Int, b: Double){
   val nic:String=id
   val acnumber: Int = n
   var  balance: Double = b
   override def toString = "[" + nic + ":" + acnumber + ":" + balance + "]"

  def transfer(a:Account,b:Double) = {
    this.balance=this.balance-b
    a.balance=a.balance+b
  }

}


