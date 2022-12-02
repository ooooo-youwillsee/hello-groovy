package com.ooooo.chapter2

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def foo(String str) {
    str?.reverse()
}


println foo("123")
println foo(null)

