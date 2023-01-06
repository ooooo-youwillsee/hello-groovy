package com.ooooo.chapter18

import groovy.test.GroovyTestCase

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class CarTest extends GroovyTestCase {
  Car car

  @Override
  protected void setUp() throws Exception {
    car = new Car()
  }


  void testInitialize() {
    assertEquals 0, car.miles
  }

  void testDrive() {
    car.drive(10)
    assertEquals 10, car.miles
  }
}