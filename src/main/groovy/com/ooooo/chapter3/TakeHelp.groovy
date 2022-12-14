package com.ooooo.chapter3

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def takeHelp(helper) {
  helper.helpMoveThings()
}


class Man {
  void helpMoveThings() {
    println "Man's helping"
  }
}

class Woman {
  void helpMoveThings() {
    println "Woman's helping"
  }
}

class Elephant {
  void helpMoveThings() {
    println "Elephant's helping"
  }

  void eatSugarcane() {
    println "I love sugarcanes"
  }
}


takeHelp(new Man())
takeHelp(new Woman())
takeHelp(new Elephant())

def takeHelpAndReward(helper) {
  helper.helpMoveThings()

  if (helper.metaClass.respondsTo(helper, "eatSugarcane")) {
    //noinspection GrUnresolvedAccess
    helper.eatSugarcane()
  }
}

takeHelpAndReward(new Man())
takeHelpAndReward(new Woman())
takeHelpAndReward(new Elephant())