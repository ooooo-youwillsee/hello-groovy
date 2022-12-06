package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def completeOrder(amount, Closure closure) {
  def tax = 0
  if (closure.maximumNumberOfParameters == 2) {
    tax = closure(amount, 6.05)
  } else {
    tax = closure(amount)
  }
  println "tax: $tax"
}


completeOrder(10) { a, b ->
  a * b
}

completeOrder(10) { a ->
  a
}


