package com.ooooo.chapter7

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def t = Thread.start {
  println "Thread started"
  def startTime = System.nanoTime()
  // 对象上的 sleep(), 不会被打断
  new Object().sleep(2000)
  def endTime = System.nanoTime()
  println "Thread done is ${endTime - startTime} ns"
}


new Object().sleep(100)
println "Let's interrupt that thread"
t.interrupt()
t.join()
