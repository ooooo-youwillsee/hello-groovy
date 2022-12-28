package com.ooooo.chapter13

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class StringUtil {
  def static toSSN(String self) {
    if (self.size() == 9) {
      "${self[0..2]}-${self[3..4]}-${self[5..8]}"
    }
  }
}


use(StringUtil) {
  println "123456789".toSSN()
}


@Category(String)
class StringUtilAnnotated {
  def toSSN() {
    if (size() == 9) {
      "${this[0..2]}-${this[3..4]}-${this[5..8]}"
    }
  }
}

use(StringUtilAnnotated) {
  println "123456789".toSSN()
}