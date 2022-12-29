package com.ooooo.chapter14

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Person2 {
  def work() {
    "working..."
  }

  def plays = ["A", "B", "C"]

  def methodMissing(String name, args) {
    println "methodMissing called for $name"

    def exist = plays.find { it == name.split("play")[1] }
    if (exist) {
      def impl = { vargs ->
        "playing ${name.split('play')[1]}"
      }

      // 重要！！！
      Person2 instance = this
      instance.metaClass."$name" = impl
      impl(args)
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
println '---'
println jack.playA()
println jack.playB()
println jack.playC()