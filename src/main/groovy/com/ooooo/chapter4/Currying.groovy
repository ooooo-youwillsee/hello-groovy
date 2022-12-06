package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */


def tellFortunes(Closure closure) {
  def closure2 = closure.curry("123")
  closure2("456")
}

tellFortunes { a, b ->
  println "a: $a, b: $b"
}