package com.ooooo.chapeter17
/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Todo {

  def level = 0

  def result = new StringWriter()

  def build(Closure closure) {
    result << "To-Do:\n"
    closure.delegate = this
    closure()
    println result
  }

  def methodMissing(String name, args) {
    handle(name, args)
  }

  def propertyMissing(String name) {
    Object[] emptyArry = []
    handle(name, emptyArry)
  }

  def handle(String name, Object[] args) {
    level++
    level.times { result << " " }
    result << placeXifStatusDone(args)
    result << name.replaceAll("_", " ")
    result << printParameters(args)
    result << "\n"

    if (args.length > 0 && args[-1] instanceof Closure) {
      def theClosure = args[-1] as Closure
      theClosure.delegate = this
      theClosure()
    }

    level--
  }

  def placeXifStatusDone(args) {
    args.length > 0 && args[0] instanceof Map && args[0]['status'] == 'done' ? 'X ' : '- '
  }

  def printParameters(args) {
    def values = ""
    if (args.length > 0 && args[0] instanceof Map) {
      values += " ["
      def count = 0
      args[0].each { k, v ->
        if (k == 'status') return
        count++
        values += (count > 1 ? " " : "")
        values += "${k}: ${v}"
      }
      values += "]"
    }
    values
  }
}


def bldr = new Todo()
bldr.build {
  xxx([start: "11", end: "22"]) {
    yyy "1": "2"
  }

  zzz([start: "23", end: "30"]) {
    ooo "123": "456"
  }
}
