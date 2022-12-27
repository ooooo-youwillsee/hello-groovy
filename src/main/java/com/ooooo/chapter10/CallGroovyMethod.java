package com.ooooo.chapter10;

import groovy.lang.GroovyShell;
import java.io.File;
import java.io.IOException;

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
public class CallGroovyMethod {
  
  public static void main(String[] args) {
    String path = "src/main/groovy/com/ooooo/chapter10/DynamicGroovyClass.groovy";
    
    GroovyShell groovyShell = new GroovyShell();
    try {
      groovyShell.evaluate(new File(path));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
}
