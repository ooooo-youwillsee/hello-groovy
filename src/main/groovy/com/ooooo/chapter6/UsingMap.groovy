package com.ooooo.chapter6

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def langs = ['C++': 'a', "Java": 'b']

println langs.getClass().name

println langs['C++']
println langs['Java']

println langs.Java

println langs.'C++'

langs.forEach { k, v ->
  println "k: $k, v: $v"
}

println langs.collect { k, v -> k.replace("+", "P")
}


println langs.find { k, v ->
  k == 'Java'
}

