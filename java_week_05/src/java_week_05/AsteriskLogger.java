package java_week_05;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		String line = buildlog(log);
		System.out.println(line);
		
	}

	private String buildlog(String log) {
		String line = "***" + log + "***";
		return line;
	}

	@Override
	public void error(String error) {
		String line = buildlog(error);
		String line1 = "";
		for (int i = 0; i < line.length(); i ++) {
			line1 += "*";
		}
		System.out.println(line1);
		System.out.println(line);
		System.out.println(line1);	
}
}