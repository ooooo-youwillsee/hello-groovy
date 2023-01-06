package com.ooooo.chapter18

import groovy.test.GroovyTestCase

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class TestCodeWithHeavierDependenciesUsingOverriding extends GroovyTestCase {

  void testMyMethod() {
    def testObj = new CodeWithHeavierDependencies()

    testObj.metaClass.someAction = { -> 10 }

    def result = 0
    testObj.metaClass.println = {
      result = it
    }

    testObj.myMethod()
    assertEquals 20, result
  }

}