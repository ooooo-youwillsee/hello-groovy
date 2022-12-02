package com.ooooo.chapter2

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def log(x, base = 10) {
  Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)
