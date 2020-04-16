import java.util.Vector;

public class SFileStreamTest
{
	private static int EXIT_STATUS;
	
	private static Vector<String> endStatus;
	
	private static String file;
	
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("Testing (Read/Write) IO Functions ... ");
		System.out.println();
		endStatus = new Vector<String>(1,1);
		file = args[0];
		singleReadTest();
		vectorReadTest();
		displayVector(endStatus);
		System.exit(EXIT_STATUS);
	}
	
	public static void displayVector(Vector<String> v) {
		for(int i = 0; i < v.size(); i++)
			System.out.println(v.elementAt(i));
	}
	
	public static void singleReadTest()
	{
		SFileStream sf = new SFileStream(file);
		if(sf.singleRead().equals("TESTING SINGLE LINE")) {
			endStatus.addElement("Single Line Read Test : PASS");
		} else {
			endStatus.addElement("Single Line Read Test : FAIL");
			EXIT_STATUS = 1;
		}
	}
	
	public static void vectorReadTest() {
		SFileStream sf = new SFileStream(file);
		Vector<String> res = sf.vectorRead();
		boolean testResult = (res.elementAt(0).equals("TESTING SINGLE LINE")) && (res.elementAt(1).equals("TESTING MULTIPLE LINES"));
		if(testResult) {
			endStatus.addElement("Vector Read Test : PASS");
		} else {
			endStatus.addElement("Vector Read Test : FAIL");
			EXIT_STATUS = 1;
		}
	}
	
}