package com.ooooo.chapter7

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def userDir = System.getProperty("user.dir")
println "userDir: $userDir"

println "---"
println new File("test.txt").text

println "---"
new File("test.txt").eachLine {
  println it
}

println "---"
println new File("test.txt").filterLine {
  it.contains("2")
}


new File("test.txt").withWriterAppend { it ->
  it << "555"
  it.newLine()
}

