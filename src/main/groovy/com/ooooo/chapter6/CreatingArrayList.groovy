package com.ooooo.chapter6

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def lst = [1, 2, 3, 4, 5, 6]

println lst
println lst.class.name


println lst[0]
println lst[lst.size() - 1]
println lst[-1]

println "dump: ${lst.dump()}"