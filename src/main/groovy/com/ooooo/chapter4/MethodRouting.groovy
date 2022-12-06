package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Handler {
  def f1() {
    println "f1 of handler called..."
  }

  def f2() {
    println "f2 of handler called..."
  }
}

class Example {
  def f1() {
    println "f1 of example called..."
  }

  def f2() {
    println "f2 of example called..."
  }

  def foo(Closure closure) {
    closure.delegate = new Handler()
    closure()
  }
}

def f1() {
  println "f1 of script called..."
}


new Example().foo {
  f1()
  f2()
}