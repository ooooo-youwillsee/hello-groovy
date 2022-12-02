package com.ooooo.chapter2

import groovy.transform.Immutable


/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Worker {
  def work() {
    println "get work done"
  }

  def analyze() {
    println "analyze"
  }

  def writeReport() {
    println "get report written"
  }
}

class Expert {
  def analyze() {
    println "expert analyze ..."
  }
}

class Manager {

  @Delegate
  Expert expert = new Expert()

  @Delegate
  Worker worker = new Worker()

}


m = new Manager()
m.analyze()
m.work()
m.writeReport()


@Immutable
class CreditCard {
  String cardNumber
  int creditLimit
}

println new CreditCard("xxx", 1000)


class Heavy {
  def size = 10

  Heavy() {
    println "Create Heavy with $size"
  }
}

class AsNeeded {
  def value

  @Lazy
  Heavy heavy1 = new Heavy()
  @Lazy
  Heavy heavy2 = { new Heavy(size: value) }()

  AsNeeded() {
    println "Created AsNeeded"
  }
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size


@Newify(CreditCard)
def fluentCreate() {
  println CreditCard("xxxx", 2000)
}

fluentCreate()


@Singleton(lazy = true)
class TheUnique {

  def hello() {
    println 'hello'
  }
}

println "Accessing TheUnique"
TheUnique.instance.hello()


