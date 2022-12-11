package com.ooooo.chapter7

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

class Car {
  int miles, fuelLevel
}

def car = new Car(fuelLevel: 80, miles: 25)

def properties = ['miles', 'fuelLevel']

properties.forEach { k ->
  println "k: $k, v: ${car[k]}"
}
