package com.ooooo.chapter2

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def receiveArgs(int a, int ... b) {
  println "a: $a, b: $b"
}

def receiveArray(int a, int[] b) {
  println "a: $a, b: $b"
}

receiveArgs(1, 2, 3, 4)
receiveArray(1, 2, 3, 4)

ExpandoMetaClass