package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def doSomething(Closure closure) {
  if (closure) {
    closure()
  } else {
    println "Using default implementation"
  }
}

doSomething {
  println "xxx"
}

doSomething()