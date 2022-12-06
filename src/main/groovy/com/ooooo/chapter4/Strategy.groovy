package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def totalSelectValues(n, Closure closure) {
  def total = 0
  for (i in 0..<n) {
    if (closure(i)) {
      total += i
    }
  }
  total
}

println totalSelectValues(10, { it -> it % 2 == 0 })

def c = { it -> it % 2 == 0 }
println totalSelectValues(10, c)