package java_week_05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		System.out.println();
		logger.error("Hello");
		System.out.println();
		Logger logger1 = new SpacedLogger();
		logger1.log("Hello");
		System.out.println();
		logger1.error("Hello");
	}

}
