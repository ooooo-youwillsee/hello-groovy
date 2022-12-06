package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def examine(Closure closure) {
  println "$closure.maximumNumberOfParameters: "

  for (final def type in closure.parameterTypes) {
    println type.name
  }
}


examine {}
examine { it }
// 0个参数
examine { -> }
examine { a -> }
examine { Date a -> }
examine { Date a, b -> }
examine { Date a, String b -> }

