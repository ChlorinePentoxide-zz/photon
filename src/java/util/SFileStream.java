import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Vector;

public class SFileStream
{
	
	public File f;
	
	public SFileStream(String fname) {
		this.f = new File(fname);
	}
	
	public SFileStream(File file) {
		this.f = file;
	}
	
	public String singleRead() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(this.f));
			String st =  br.readLine();
			br.close();
			return st;
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return null;
	}
	
	public Vector<String> vectorRead() {
		Vector<String> v = new Vector<String>(1,1);
		try {
			BufferedReader br = new BufferedReader(new FileReader(this.f));
			while(true) {
				String s = br.readLine();
				if(s == null) break;
				v.addElement(s);
			}
			br.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return v;
	}
	
	public void vectorWrite(Vector<String> v) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.f));
			for(int i = 0; i < v.size(); i++)
				bw.write(v.elementAt(i));
			bw.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}