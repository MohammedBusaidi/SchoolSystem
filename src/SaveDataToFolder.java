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
		
		try(FileWriter writer = new FileWriter(file, true)) {
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
		        System.out.println("DATA SAVED TO FOLDER!");
		}catch (Exception e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
	}

}
