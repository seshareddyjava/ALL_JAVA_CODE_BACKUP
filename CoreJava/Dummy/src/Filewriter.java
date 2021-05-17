import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Filewriter {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("E:\\Database for scott tiger.txt"));
			
			String line=br.readLine();
		    byte[] b= line.getBytes();
		   // char[] c=(byte[])line.getBytes(); 
		    for(byte d :b)
		    System.out.print((char)d+" ");
		    BufferedWriter bw = new BufferedWriter(new FileWriter("E:br.txt"));
		    //bw.write(c, 0, 0);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
