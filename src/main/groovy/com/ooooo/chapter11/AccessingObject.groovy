package com.ooooo.chapter11
/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def printInfo(obj) {
  def usrRequestedProperty = "bytes"
  def usrRequestedMethod = 'toUpperCase'

  println obj[usrRequestedProperty]
  println obj."$usrRequestedProperty"

  println obj."$usrRequestedMethod"()
  println obj.invokeMethod(usrRequestedMethod, null)
}


printInfo('hello')

println '---'


println "Properties of 'hello' are: "
'hello'.properties.each { println it }