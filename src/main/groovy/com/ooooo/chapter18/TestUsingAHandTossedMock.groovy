package com.ooooo.chapter18

import groovy.test.GroovyTestCase

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class TestWithExpando extends GroovyTestCase {

  void testMethodA() {
    def testObj = new ClassWithDependency()
    def fileMock = new HandTossedFileMock()
    testObj.methodA(1, fileMock)

    assertEquals "The value is 1", fileMock.result
  }
}

class HandTossedFileMock {
  def result

  def write(val) {
    result = val
  }
}