package NumberProgram;

import java.util.Scanner;

public class CheckLeapYear {

	/*
	 * Write a program to check whether the year is leap or not.
	 * 
	 * Input: 2020 Output: Leap
	 * 
	 *  NOTE - A year is a leap year if:
				It is divisible by 4
				Except for years that are divisible by 100,
				Unless the year is also divisible by 400
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year and YYYY format : ");
		String inputYear = sc.nextLine();
		try {
			int year = Integer.parseInt(inputYear);
			boolean leapFlag = LeapYear(year);
			if (leapFlag == true) {
				System.out.println(year + " is a Leap Year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Year format: " + inputYear + " Please enter Year in YYYY format only");
		}

	}

	public static boolean LeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
