package com.ooooo.chapter8

import groovy.xml.XmlParser

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def root = new XmlParser().parse(new File("languages.xml"))

root.each { it ->
  println it
  println "${it.@name} authored by ${it.author[0].text()}"
}

println "---"
def languagesByAuthor = { authorName ->
  root.findAll { it.author[0].text() == authorName }
      .collect { it.@name }
      .join(",")
}


println languagesByAuthor("aaa")


println "---"
root.appendNode("bbb", [a: '1', b: '2'])
def writer = new StringWriter()
root.print(new PrintWriter(writer))
println writer
