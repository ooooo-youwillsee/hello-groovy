package com.ooooo.chapter4
/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Resource {
  def open() {
    println "open"
  }

  def close() {
    println "close"
  }

  def read() {
    println "read..."
  }

  def write() {
    println "write..."
  }

  def static use(Closure closure) {
    def r = new Resource()
    try {
      r.open()
      closure(r)
    } finally {
      r.close()
    }
  }

}

def r = new Resource()

r.open()
r.read()
r.write()
r.close()

println "---"

Resource.use { Resource res ->
  res.read()
  res.write()
}

