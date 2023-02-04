package java_week_05;



public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		String line = buildlog(log);
	    System.out.println(line);
	}

	private String buildlog(String log) {
		String line = "";
		for (int i = 0; i < log.length(); i++) {
		    line += Character.toString(log.charAt(i)) + " " ;
	}
		line = line.trim();
		return line;
           
	}
	@Override
	public void error(String error) {
		System.out.print("ERROR: " + buildlog(error));
		
	}

}
