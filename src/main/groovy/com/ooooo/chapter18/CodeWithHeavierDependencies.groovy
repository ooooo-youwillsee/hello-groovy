package com.ooooo.chapter18

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class CodeWithHeavierDependencies {
  void myMethod() {
    def value = someAction() + 10
    println value
  }

  int someAction() {
    // 模拟消耗时间的动作
    Thread.sleep(5000)
    return Math.random() * 100
  }
}