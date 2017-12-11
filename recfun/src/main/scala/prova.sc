"(just an) example".toList.head
")".head

// sum() returns a function that takes two integers and returns an integer

def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a+1, acc+a)
  }
  loop(a+1, 0)
}

sum(sum:2=>3)