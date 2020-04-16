import java.util.Vector;

public class GlobalTest
{
	
	private static int EXIT_STATUS;
	
	private static Vector<String> endStatus;
	
	public static void main(String args[]) {
		endStatus = new Vector<String>(1,1);
		emptyTest();
		runTest();
		endTest();
		displayVector(endStatus);
		System.exit(EXIT_STATUS);
	}

	public static void displayVector(Vector<String> v) {
		for(int i = 0; i < v.size(); i++)
			System.out.println(v.elementAt(i));
	}

	public static void emptyTest() {
		if(Global.isRunning() == true) {
			endStatus.addElement("Global Init Test : FAIL");
		} else {
			endStatus.addElement("Global Init Test : PASS");
		}
	}
	
	public static void runTest() {
		Global.startProgram();
		if(Global.isRunning() == false) {
			endStatus.addElement("Global Run Test : FAIL");
		} else {
			endStatus.addElement("Global Run Test : PASS");
		}
	}
	
	public static void endTest() {
		Global.startProgram();
		Global.endProgram();
		if(Global.isRunning() == true) {
			endStatus.addElement("Global End Run Test : FAIL");
		} else {
			endStatus.addElement("Global End Run Test : PASS");
		}
	}
	
}