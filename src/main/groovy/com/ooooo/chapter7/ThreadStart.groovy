package com.ooooo.chapter7
/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def printThreadInfo(msg) {
  def t = Thread.currentThread()
  println "$msg Thread is ${t}. Daemon? ${t.daemon}"
}

printThreadInfo('Main')

Thread.start {
  printThreadInfo("Started")
  sleep(3000) {
    println "Interrupted"
  }
  println "Finished Started"
}

sleep(1000)

Thread.startDaemon {
  printThreadInfo("Started Daemon")
  sleep(5000) {
    println "Interrupted"
  }
  // 不会执行到这里
  println "Finished Started Daemon"
}

