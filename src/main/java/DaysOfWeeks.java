public class DaysOfWeeks {
	/*
	 * Write a method called dayOfTheWeek that takes in an integer representing the day of the week
	 * and returns a String with the name of that day. Uses switch statement in your method.
	 * The first day of the week is Sunday. There should be a default case that handles integers
	 * outside the range of 1 - 7.
	 */

	public static String dayOfTheWeek(int dayOfWeek) {


		switch(dayOfWeek)
		{
			case 1:
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			case 7:
				return "Saturday";
			default:
				return "Invalid Entry";
		}
	}
}
