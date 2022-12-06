package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def tellFortune(Closure closure) {
  closure "123", "456"
}


tellFortune { a, b ->
  println "a: $a, b: $b"
}

