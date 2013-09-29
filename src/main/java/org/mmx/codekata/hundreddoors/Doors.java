package org.mmx.codekata.hundreddoors;


public class Doors {

	private static final int DOOR_COUNT = 100;
	
	private boolean[] doors = new boolean[DOOR_COUNT];

	public Doors() {
		init();
	}

	private void init() {
		
	}

	public boolean[] pass(int step) {

		if (step == 0) {
			return doors;
		}
		
		for (int i = 0 ; i< 100; i = i + step) {
			if (step % 2 == 0) {
				doors[i] = true;
			} else {
				doors[i] = false;
			}
		}
		
	/*	for (int i = 0; i < DOOR_COUNT; i++) {
			int doorNo = i + 1;*/
			/*if (step == 0) {
				doors[i] = false;
			} else if (step == 1) {
				doors[i] = true;
			} *//*else if (step == 2) {
				if (doorNo % 2 == 0) {
					doors[i] = false;
				} else {
					doors[i] = true;
				}
			} else if (step == 3) {
				if (doorNo % 6 == 0) {
					doors[i] = true;
				} else if ((doorNo % 3 == 0 && doorNo % 2 == 1)
						|| doorNo % 2 == 0)  {
					doors[i] = false;
				} else {
					doors[i] = true;
				}
			}*/
		return doors;
	}

}
