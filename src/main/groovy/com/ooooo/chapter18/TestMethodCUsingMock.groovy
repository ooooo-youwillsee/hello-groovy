package com.ooooo.chapter18

import groovy.mock.interceptor.MockFor
import groovy.test.GroovyTestCase

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class TestMethodCUsingMock extends GroovyTestCase {

  void testMethodC() {
    def testObj = new ClassWithDependency()

    def fileMock = new MockFor(FileWriter.class)
    def text = ""
    fileMock.demand.write { text = it.toString() }
    fileMock.demand.close {}
    fileMock.use {
      testObj.methodC(1)
    }

    assertEquals "The value is 1", text
  }
}