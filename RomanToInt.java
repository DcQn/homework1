package be6_complexity_hw5;

public class RomanToInt {
	static int number(char roman) {
		if (roman == 'I')
			return 1;
		if (roman == 'V')
			return 5;
		if (roman == 'X')
			return 10;
		if (roman == 'L')
			return 50;
		if (roman == 'C')
			return 100;
		if (roman == 'D')
			return 500;
		if (roman == 'M')
			return 1000;
		return 0;
	}

	public static int convertRomanToInt(String s) {
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			int value1 = number(s.charAt(i));
			if (i + 1 < s.length()) {
				int value2 = number(s.charAt(i + 1));
				if (value1 >= value2) {
					total = total + value1;
				} else {
					total = total - value1;
				}
			} else {
				total = total + value1;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(convertRomanToInt("LVIII"));
	}
}

// Time complexity: n + (1 + n*(1 + 2*2)) = 6n + 1
