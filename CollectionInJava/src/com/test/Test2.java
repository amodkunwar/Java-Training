package com.test;

public class Test2 {
	public static void main(String[] args) {
		String file = "Nobody expects the Spanish Inquisition! Our chief weapon is surprise... surprise and fear... fear and surprise... our two weapons are fear and surprise... and ruthless efficiency... Our three weapons are fear, surprise, and ruthless efficiency...\r\n"
				+ " and an almost fanatical devotion... Our four... no... amongst our weapons.... amongst our weaponry...are such elements as fear, surprise.... I'll come in again.\r\n"
				+ "";

		String dictionary = "surprise efficiency spanish";
		
		int count = 0;
		
		for (String string : args) {
			if(file.contains(string)) {
				count++;
			}
		}
		
		System.out.println();
		
	}
}
