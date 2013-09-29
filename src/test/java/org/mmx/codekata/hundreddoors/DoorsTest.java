package org.mmx.codekata.hundreddoors;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.Test;

public class DoorsTest {
	
	private Doors sut = new Doors();
	@Test 
	public void test_100_doors_closed_when_no_pass() {
		boolean[] actualDoors = sut.pass(0);
		
		for (boolean doorStatus : actualDoors) {
			assertFalse(doorStatus);
		}
	}
	
	@Test
	public void test_100_doors_opened_when_first_pass() {
		
		boolean[] actualDoors = sut.pass(1);
		
		for (boolean doorStatus : actualDoors) {
			assertTrue(doorStatus);
		}
	}

	@Test
	public void test_100_doors_when_second_pass() {
		
		boolean[] actualDoors = sut.pass(2);
		
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 2 == 0) {
				assertFalse(actualDoors[i]);
			} else {
				assertTrue(actualDoors[i]);
			}
		}
	}
	
	@Test
	public void test_100_doors_when_thrid_pass() {
		
		boolean[] actualDoors = sut.pass(3);
		
		assertTrue(actualDoors[0]);
		assertFalse(actualDoors[1]);
		assertFalse(actualDoors[2]);
		assertFalse(actualDoors[3]);
		assertTrue(actualDoors[4]);
		assertTrue(actualDoors[5]);
		assertTrue(actualDoors[6]);
		assertFalse(actualDoors[7]);
		assertFalse(actualDoors[8]);
		assertFalse(actualDoors[9]);

		/*for (int i = 0; i < 100; i++) {
			int doorNo = i + 1;
			if (doorNo % 6 == 0) {
				assertTrue(true == actualDoors[i]);
			} else if (doorNo % 3 == 0 || doorNo % 2 == 0) {
				assertTrue(false == actualDoors[i]);
			} else {
				assertTrue(true == actualDoors[i]);
			}
		}*/
	}
}
