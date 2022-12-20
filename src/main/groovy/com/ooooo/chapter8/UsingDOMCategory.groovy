package com.ooooo.chapter8

import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def doc = DOMBuilder.parse(new FileReader("languages.xml"))

def root = doc.documentElement

use(DOMCategory) {
  def languages = root.language
  languages.each { language ->
    println "${language.'@name'} authored by ${language.author[0].text()}"
  }
}