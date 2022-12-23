package file_io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

public static void main(String[] args) {
	  File file_obj=new File("/home/raghav/Music/raghav.txt");
	//File file_obj1=new File("/home/raghav/Music/raghav1.txt");
		try {
			System.out.println(file_obj.createNewFile());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//file_obj.delete();//delete the file
		//file_obj.exists();// check the file
		//file_obj.length();//length of the file
		//file_obj.getPath();//storage path
		//file_obj.getName();// get file Name
		//file_obj.isDirectory();//check is folder.
		//file_obj.isFile();//check is file.
		//file_obj.isHidden();//check this is hidden file
		
	//file_obj1=new File("/home/raghav/Music/siva/raghav/bharath");
		//file_obj1.mkdirs();//create multi sub folders.
		//file_obj1.mkdir();//create single sub folders.
		System.out.println(file_obj.getName());
	}

}
