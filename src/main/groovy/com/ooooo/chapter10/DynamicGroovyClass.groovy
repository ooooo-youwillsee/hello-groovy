package com.ooooo.chapter10

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class DynamicGroovy {

  def methodMissing(String name, Object[] args) {
    println "You called $name with ${args.join(', ')}"
    args.size()
  }

}


def user = new User("1", "tom")
println user