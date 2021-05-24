package com.test;

public class Test {

	public static void main(String[] args) {
		String file = "Nobody expects the Spanish Inquisition! Our chief weapon is surprise... surprise and fear... fear and surprise... our two weapons are fear and surprise... and ruthless efficiency... Our three weapons are fear, surprise, and ruthless efficiency...\r\n"
				+ " and an almost fanatical devotion... Our four... no... amongst our weapons.... amongst our weaponry...are such elements as fear, surprise.... I'll come in again.\r\n"
				+ "";

		String dictionary = "surprise efficiency spanish";

		String[] split = dictionary.split(" ");
		
		for (String string : split) {
			checkString(file.toLowerCase(), string);
		}
	}

	private static void checkString(String file, String str) {
		char[] c1 = file.toCharArray();
		char[] c2 = str.toCharArray();
		int count = 0;

		for (int i = 0; i < c1.length; i++) {
			int k = i;
			int j = 0;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				j++;
				k++;
			}

			if (j == c2.length) {
				count++;
			}

		}
		System.out.println(str + " count is : " + count);
	}

}
