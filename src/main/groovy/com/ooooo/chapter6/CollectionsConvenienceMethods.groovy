package com.ooooo.chapter6

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def lst = ["123", "456"]

println lst.collect { it.size() }.sum()

println lst.inject(0) { a, b ->
  a + b.size()
}


def lst2 = [1, 2, 3, 4, 5, 6]

// 是否存在【一个】
println lst2.any { it == 3 }

// 是否存在【全部】
println lst2.every { it == 3 }