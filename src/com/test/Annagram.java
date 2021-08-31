// annagram means 2 string has same characters and same no of characters 
// abc .. bca or gayatri , ayatrig
package com.test;

public class Annagram {

	public static void main(String[] args) {
		Annagram am = new Annagram();
		boolean b1 =am.annagram("abc", "bcab");
				System.out.println(b1);

	}

	public boolean annagram(String s1, String s2) {
		if (s1.length() == s2.length()) {
			Annagram am = new Annagram();

			for (int i = 0; i <= s1.length() - 1; i = i + 1) {
				int result = am.findcharacter(s2, s1.charAt(i));
				if (result == -1) {
					return false;
				}

			}
			return true;
		}
		else {
			return false;
		}

	}

	/**
	 * This method finds character c in string s
	 */
	public int findcharacter(String s, char c) {
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == c) {
				return i;
			}

			i = i + 1;

		}
		return -1;
	}
}
