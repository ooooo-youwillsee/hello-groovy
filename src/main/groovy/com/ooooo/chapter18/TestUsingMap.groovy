package com.ooooo.chapter18

import groovy.test.GroovyTestCase

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class TestUsingMap extends GroovyTestCase {

  void testMothodA() {
    def text = ''
    def fileMock = [write: { text = it }]

    def testObj = new ClassWithDependency()
    testObj.methodA(1, fileMock)

    assertEquals "The value is 1", text
  }
}