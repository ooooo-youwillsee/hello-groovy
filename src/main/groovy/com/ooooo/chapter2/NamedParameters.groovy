package com.ooooo.chapter2

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Robot {
  def type, height, width

  def access(location, weight, fragile) {
    println "Received fragile? $fragile, weight: $weight, loc: $location"
  }
}

robot = new Robot(type: 'arm', width: 10, height: 40)

println "$robot.type, $robot.height, $robot.width"


robot.access(x: 30, y: 20, z: 10, 50, true)