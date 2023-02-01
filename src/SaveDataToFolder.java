import java.io.File;
import java.io.FileWriter;

public class SaveDataToFolder {
	public void saveDataFolder () {
		File newFolder = new File(
				"C:" + File.separator + 
				"Users" + File.separator +
				"Lenovo" + File.separator +
				"eclipse-workspace" +  File.separator +
				"SchoolSystem-main" +  File.separator +
				"StudentDetails"
				);
		if(!newFolder.exists()) {
			newFolder.mkdirs();
		}
		File file = new File(
			"C:" + File.separator + 
			"Users" + File.separator +
			"Lenovo" + File.separator +
			"eclipse-workspace" +  File.separator +
			"SchoolSystem-main" +  File.separator +
			"StudentDetails" + File.separator + "file.txt");
		try(FileWriter writer = new FileWriter(file)) {
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
		            				Main.newSchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark);
		            }
		        }
		        writer.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DATA SAVED TO FOLDER");
		
	}

}
