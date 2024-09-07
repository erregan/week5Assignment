package Week5;

import java.util.Date;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
//	testing
//		Date date = new Date();
//		System.out.println(date.toString() + ": " + log);
// a.	
		System.out.println("***Error: " + log + "***");

	}

//  b.

	@Override
	public void error(String error) {

		for (int i = 0; i < (error.length() + 13); i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.println("***Error: " + error + "***");

		for (int i = 0; i < (error.length() + 13); i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
