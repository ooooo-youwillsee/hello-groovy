package com.ooooo.chapter5

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def obj = ~"hello"

println obj.class.name


def p = ~"(G|g)roovy"
def text = "Groovy is Hip"

// 部分匹配
if (text =~ p) {
  println "match"
} else {
  println "no match"
}

// 全匹配
if (text ==~ p) {
  println "match"
} else {
  println "no match"
}