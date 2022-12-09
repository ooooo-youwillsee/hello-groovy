package com.ooooo.chapter6

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def lst = [1, 2, 3, 4, 5, 6]

lst.forEach { it -> println it }

println "---"

def lst2 = lst.collect { it -> it * 2 }

lst2.forEach { println it }