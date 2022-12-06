package com.ooooo.chapter4

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def pickEven(n, Closure block) {
  for (int i = 0; i <= n; i += 2) {
    block(i)
  }
}

pickEven(10, { println it })