import java.io.*;
public class DeSerialize {
	public void deSerialize() throws ClassNotFoundException {
		 // Reading the object from a file
		try {
        FileInputStream file = new FileInputStream("StudentDetails1.txt");
        ObjectInputStream in = new ObjectInputStream(file);
        while (true) {
        	try {
        		String readObj = (String) in.readObject();
        		System.out.println(readObj);
        	} catch(EOFException e) {
        		break;
        	}
        }
		in.close();
		file.close();
		System.out.println("DeSerialized and saved!");
			
	} catch(IOException ex)
    {
        System.out.println("IOException is caught");
    }
}}
