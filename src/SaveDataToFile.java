import java.io.*;
public class SaveDataToFile {
	public void saveData() {
	    try {
	    	FileWriter writer = new FileWriter("School.txt", true);
			writer.write(String.format("%20s %20s %20s %20s\n", "School Name", "Student name", "Subject name", "Mark"));
			writer.write("_____________________________________________________________________________________________________________________\n");
			for(int i = 0; i<Main.newSchool.studentList.size(); i++) {
				for(int j = 0; j<Main.newSchool.subjectList.size(); j++) {
					writer.write(String.format("%20s %20s %20s %20s\n", 
							Main.newSchool.schoolName,
							Main.newSchool.studentList.get(i).studentName,
							Main.newSchool.subjectList.get(j).subjectName,
							Main.newSchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark
							));
				}
				writer.write("_____________________________________________________________________________________________________________________\n");
			}
	        writer.close();
	        System.out.println("DATA SAVED TO FILE!");
	    } catch(Exception e) {
	    	System.out.println("ERROR!");
	        e.printStackTrace();
	    }
	}

}
