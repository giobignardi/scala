import java.util.NoSuchElementException

def abs(x:Double) = if (x < 0) -x else x

def sqrt(x:Double): Double ={

  def sqrtIterator(guess: Double): Double =
    if (isGoodEnough(guess))guess
    else sqrtIterator(improve(guess))

  def isGoodEnough(guess: Double): Boolean =
    abs(guess*guess-x)/x < 0.000000001

  def improve(guess: Double)=
    (guess + x/guess)/2
  if (x<0) throw new IllegalArgumentException("arg must be >0")
  else sqrtIterator(1.0)
}

def factorial(n: Int)={
  def loop(accu: Int, n: Int): Int=
    if (n==0)accu else loop(accu*n,n-1)
  loop(1,n)
}

def sum(xs: List[Int]): Int = {
  if (xs.isEmpty) 0
  else xs.head + sum(xs.tail)
}

def max(xs: List[Int]): Int = {
  if (xs.isEmpty) throw new NoSuchElementException("xs empty")
  else xs.fold(Int.MinValue)(Math.max)
}