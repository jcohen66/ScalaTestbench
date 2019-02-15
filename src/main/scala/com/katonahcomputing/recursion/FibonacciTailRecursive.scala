package com.katonahcomputing.recursion

import scala.annotation.tailrec

/**
  * The `fibHelper` code comes from this url: rosettacode.org/wiki/Fibonacci_sequence#Scala
  */
object FibonacciTailRecursive extends App {

  println(fib(9))

  def fib(x: Int): BigInt = {
    @tailrec def fibHelper(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x - 1, next, (next + prev))
    }
    fibHelper(x)
  }

}