package Week5;

//6.     Create a class named App that has a main method.

			// a.  In this class instantiate an instance of each of your logger classes 
			//     that implement the Logger interface.
			// b. Test both methods on both instances, passing in Strings of your choice.

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AsteriskLogger aLog = new AsteriskLogger();
		SpacedLogger sLog = new SpacedLogger();
		aLog.log("Good morning");
		System.out.println();
		aLog.error("Goodbye");
		System.out.println();
	
		sLog.log("Good morning");
		sLog.error("Good evening");
	
		
		
		
	}

}
