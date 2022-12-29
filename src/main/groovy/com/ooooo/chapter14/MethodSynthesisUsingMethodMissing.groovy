package com.ooooo.chapter14

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Person {
  def work() {
    "working..."
  }

  def plays = ["A", "B", "C"]

  def methodMissing(String name, args) {
    println "methodMissing called for $name"

    def exist = plays.find { it == name.split("play")[1] }
    if (exist) {
      "playing ${name.split('play')[1]}"
    } else {
      throw new MissingMethodException(name, Person2.class, args)
    }
  }
}


def jack = new Person2()

println jack.work()
println jack.playA()
println jack.playB()
println jack.playC()
