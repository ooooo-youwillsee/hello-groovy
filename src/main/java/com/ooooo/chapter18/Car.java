package com.ooooo.chapter18;

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
public class Car {
	
	private int miles;
	
	public int getMiles() {
		return miles;
	}
	
	public void drive(int dist) {
		miles += dist;
	}
}
