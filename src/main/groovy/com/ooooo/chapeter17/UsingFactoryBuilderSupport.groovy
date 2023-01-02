package com.ooooo.chapeter17

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Robot {
  String name
  def movements = []

  void go() {
    println "Robot $name operating..."
    movements.forEach { println it }
  }
}

class ForwardMove {
  def dist

  String toString() {
    "move distance... $dist"
  }
}

class LeftTurn {
  def rotation

  String toString() {
    "turn left... $rotation degrees"
  }
}

class RobotFactory extends AbstractFactory {
  @Override
  Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
    new Robot(name: value)
  }

  @Override
  void setChild(FactoryBuilderSupport builder, Object parent, Object child) {
    parent.movements << child
  }
}

class ForwardMoveFactory extends AbstractFactory {
  @Override
  boolean isLeaf() {
    true
  }

  @Override
  Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
    new ForwardMove()
  }

  @Override
  boolean onHandleNodeAttributes(FactoryBuilderSupport builder, Object node, Map attributes) {
    if (attributes.speed && attributes.duration) {
      node.dist = attributes.speed * attributes.duration
      attributes.remove('speed')
      attributes.remove('duration')
    }
    true
  }
}

class LeftTurnFactory extends AbstractFactory {

  @Override
  Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
    new LeftTurn()
  }
}


class RobotBuilder extends FactoryBuilderSupport {
  {
    registerFactory("robot", new RobotFactory())
    registerFactory("forward", new ForwardMoveFactory())
    registerFactory("left", new LeftTurnFactory())
  }
}

def robotBuilder = new RobotBuilder()

def robot = robotBuilder.robot('bRobot') {
  forward(dist: 20)
}

robot.go()



