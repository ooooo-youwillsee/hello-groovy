package com.ooooo.chapter14
/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Person3 {}

def emc = new ExpandoMetaClass(Person3)
emc.methodMissing = { String name, args ->
  "name: $name"
}
emc.initialize()

def jack = new Person3()
def paul = new Person3()

jack.metaClass = emc

println jack.sing()
println jack.dance()
println jack.juggle()

try {
  paul.sing()
} catch (ex) {
  println ex
}
