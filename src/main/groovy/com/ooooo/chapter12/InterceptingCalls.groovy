package com.ooooo.chapter12

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Car implements GroovyInterceptable {

  def check() {
    System.out.println "check called..."
  }

  def start() {
    System.out.println "start called..."
  }

  def drive() {
    System.out.println "drive called..."
  }

  def invokeMethod(String name, args) {
    System.out.println "call to $name intercepted.."

    if (name != 'check') {
      System.out.println "running filter"
      Car2.metaClass.getMetaMethod("check").invoke(this, args)
    }

    def validMethod = Car2.metaClass.getMetaMethod(name, args)

    if (validMethod) {
      validMethod.invoke(this, args)
    } else {
      Car2.metaClass.invokeMethod(this, name, args)
    }
  }
}

def car = new Car2()

car.start()
car.drive()
car.check()


try {
  car.speed()
} catch (e) {
  println e
}