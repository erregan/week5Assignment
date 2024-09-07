package Week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {

// a.
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}

			result.append(log.charAt(i));
		}

		System.out.println(result.toString());

	}

	@Override
	public void error(String error) {

// b.
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(error.charAt(i));
		}
		System.out.println("ERROR: " + result.toString());

	}
}
