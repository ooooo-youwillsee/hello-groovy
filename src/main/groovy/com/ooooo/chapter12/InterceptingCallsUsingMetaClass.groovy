package com.ooooo.chapter12

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */


class Car2 {
  def check() {
    System.out.println "check called..."
  }

  def start() {
    System.out.println "start called..."
  }

  def drive() {
    System.out.println "drive called..."
  }
}

Car2.metaClass.invokeMethod = { String name, args ->
  System.out.println "call to $name intercepted.."

  if (name != 'check') {
    System.out.println "running filter"
    Car2.metaClass.getMetaMethod('check').invoke(delegate, args)
  }

  def validMethod = Car2.metaClass.getMetaMethod(name, args)

  if (validMethod) {
    validMethod.invoke(delegate, args)
  } else {
    Car2.metaClass.invokeMissingMethod(delegate, name, args)
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