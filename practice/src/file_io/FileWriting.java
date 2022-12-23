package file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		File file_obj=new File("/home/raghav/Music/siva/raghav/bharath_resume.txt");
		
		try {
			FileWriter writer=new FileWriter(file_obj,true);
			BufferedWriter bwriter=new BufferedWriter(writer);
		    writer.write("Bharathvaj B.tech");
		    writer.flush();
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader(file_obj);
			BufferedReader breader=new BufferedReader(reader);
		    String out=breader.readLine();
		    while(out!=null) {
		    	System.out.println(out);
		    	out=breader.readLine();
		    }
		    breader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
