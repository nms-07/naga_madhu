package revature_programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class File_handling {

	public static void main(String[] args) throws IOException {
		try {
		FileReader reader=new FileReader("/home/_venom_/Desktop/s.py");
		BufferedReader br=new BufferedReader(reader);
		BufferedWriter bw=new BufferedWriter(new FileWriter("/home/_venom_/Desktop/python/p.py"));
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);
			bw.write(s);
			s=br.readLine();
		}
		br.close();
		reader.close();

	}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
