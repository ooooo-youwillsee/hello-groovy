package com.ooooo.chapter7

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Person {
  def walk() {
    println "Walking..."
  }

  def walk(int miles) {
    println "Walking $miles miles..."
  }

  def walk(int miles, String where) {
    println "Walking $miles miles $where..."
  }
}

def p = new Person()

p.invokeMethod("walk", null)
p.invokeMethod("walk", 10)
p.invokeMethod("walk", [10, "uphill"])

