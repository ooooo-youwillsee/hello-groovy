package com.ooooo.chapeter17

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */


class Todo2 extends BuilderSupport {

  def level = 0

  def result = new StringWriter()

  @Override
  protected void setParent(Object parent, Object child) {

  }

  @Override
  protected Object createNode(Object name) {
    if (name == 'build') {
      result << "To-Do:\n"
      'buildnode'
    } else {
      handle(name, [:])
    }
  }

  @Override
  protected Object createNode(Object name, Object value) {
    return null
  }

  @Override
  protected Object createNode(Object name, Map attributes) {
    handle(name, attributes)
  }

  def propertyMissing(String name) {
    handle(name, [:])
    level--
  }

  @Override
  protected void nodeCompleted(Object parent, Object node) {
    level--
    if (node == 'buildnode') {
      println result
    }
  }

  @Override
  protected Object createNode(Object name, Map attributes, Object value) {
    return null
  }

  def handle(String name, attributes) {
    level++
    level.times { result << " " }
    result << placeXifStatusDone(attributes)
    result << name.replaceAll("_", " ")
    result << printParameters(attributes)
    result << "\n"
    name
  }

  def placeXifStatusDone(attributes) {
    attributes['status'] == 'done' ? 'X ' : '- '
  }

  def printParameters(attributes) {
    def values = ""
    if (attributes.size() > 0) {
      values += " ["
      def count = 0
      attributes.each { k, v ->
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


def bldr = new Todo2()
bldr.build {
  xxx([start: "11", end: "22"]) {
    yyy "1": "2"
  }

  zzz([start: "23", end: "30"]) {
    ooo "123": "456"
  }
}
