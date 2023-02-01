import java.io.*;
public class SaveDataToFile {
	public void saveData() {
	    try {
	    	FileWriter writer = new FileWriter("School.txt", true);
	    	writer.write("______________________________________________________");
	        writer.write("School Name: " + Main.newSchool.schoolName + "\n" );
	        writer.write("Subjects: ");
	        for (int i=0; i<Main.newSchool.subjectList.size();i++) {
	            writer.write(Main.newSchool.subjectList.get(i).subjectName + "\n");
	        }
	        writer.write("Students: ");
	        for(int i=0; i<Main.newSchool.studentList.size();i++) {
	            writer.write(Main.newSchool.studentList.get(i).studentName + "\n");
	            for(int j=0; j<Main.newSchool.studentList.get(i).studentSubjectList.size();j++) {
	                writer.write(Main.newSchool.studentList.get(i).studentSubjectList.get(j).subjectName + ": " + 
	                		Main.newSchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark + "\n");
	            }
	        }
	        writer.close();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    System.out.println("DATA SAVED TO FILE ");
	}

}
