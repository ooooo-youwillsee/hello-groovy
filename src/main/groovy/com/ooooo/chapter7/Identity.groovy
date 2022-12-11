package com.ooooo.chapter7

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def lst = [1, 2]

lst.with {
  add(3)
  add(4)

  println size()
  println contains(2)
}


lst.with {
  println "this is $this"
  println "owner is $owner"
  println "delegate is $delegate"
}


