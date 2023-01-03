package com.ooooo.chapter15

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def carA = new Expando()
def carB = new Expando(year: 2012, mile: 0)

carA.year = 2012
carA.miles = 10

println "carA: " + carA
println "carB: " + carB


