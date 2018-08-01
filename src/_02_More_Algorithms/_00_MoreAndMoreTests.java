package _02_More_Algorithms;

import static org.junit.Assert.*;

import java.awt.geom.Arc2D.Double;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }

	private Object multiply(int i, int j) {
		System.out.println(i+"  x "+j+" = "+i*j);
		return i+" x "+j+" = "+i*j;
	}

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	private boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if(i%j==0) {
				return false;
			}
		}

		return true;
	}

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	private boolean isSquare(int i) {
		double root = Math.sqrt(i);
		if (root % 1 == 0) {
			return true;
		}
		return false;
	}

	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(2));
	    assertFalse(isCube(143));

	  }

	private boolean isCube(int i) {
		double step=1;
		if(Math.cbrt(i)%1==0) {
			return true;
		}
		return false;
	}
	private double cb(double step,int i) {
		double temp=0;
		System.out.println(step);
		for(double b=0;b*b*b!=i;b=b+step) {
			System.err.println(i);
			if(step<0.001) {
				return b;
			}
			if(b>i) {
				cb(step/10,i);
			}
			
			temp=b;
		}
		return temp;
		
	}



}
