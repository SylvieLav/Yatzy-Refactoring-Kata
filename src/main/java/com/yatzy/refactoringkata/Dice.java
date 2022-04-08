package com.yatzy.refactoringkata;

import java.util.Arrays;
import java.util.List;

public class Dice {
	
	public static List<Integer> roll;
	
	public Dice (int d1, int d2, int d3, int d4, int d5) {
		this.roll = Arrays.asList(d1, d2, d3, d4, d5);
	}

}
