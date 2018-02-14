public class Numbers {

	/*
	 * Write a method called isNumberNegPos that returns a String specifying
	 * if a number is positive, negative, or zero.
	 */

	public static String isNumberNegPos(int num) {

		if (num > 0) {
			return "Positive";
		} else if (num < 0) {
			return "Negative";
		} return "Zero";
	}
}
