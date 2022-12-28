package com.ooooo.chapter13

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

Integer.metaClass {
  daysFormNow = { ->
    Calendar today = Calendar.getInstance()
    today.add(Calendar.DAY_OF_MONTH, delegate)
    today.time
  }


  getDaysFromNow = { ->
    Calendar today = Calendar.instance
    today.add(Calendar.DAY_OF_MONTH, delegate)
    today.time
  }

  'static' {
    isEven = { val -> val % 2 == 0 }
  }

  constuctor = { Calendar calendar ->
    new Integer(calendar.get(Calendar.DAY_OF_YEAR))
  }

  constuctor = { int val ->
    println "Intercepting constructor all"
    def constructor = Integer.class.getConstructor(Integer.TYPE)
    constructor.newInstance(val)
  }
}


def a = 1

println Integer.isEven(a)

println a.getDaysFromNow()
