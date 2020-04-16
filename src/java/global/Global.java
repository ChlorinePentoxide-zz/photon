public class Global 
{
	
	private static boolean status;
	
	public static void startProgram() {
		status = true;
	}
	
	public static boolean isRunning() {
		return status;
	}
	
	public static void endProgram() {
		status = false;
	}
	
}