package com.ooooo.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
public class Execute {

  public static void main(String[] args) {
    try {
      Process process = Runtime.getRuntime().exec("java -version");
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

      String line;
      while (true) {
        line = bufferedReader.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
