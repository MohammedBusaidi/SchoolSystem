import java.io.*;
public class Serialize {
	public void serialize() {
		try {
		FileOutputStream file = new FileOutputStream("StudentDetails1.txt", true);
		ObjectOutputStream out = new ObjectOutputStream(file);
		for(int i = 0; i<Main.newSchool.studentList.size(); i++) {
			for(int j = 0; j<Main.newSchool.subjectList.size(); j++) {
				out.writeObject(String.format("%20s %20s %20s %20s\n", 
						Main.newSchool.schoolName,
						Main.newSchool.studentList.get(i).studentName,
						Main.newSchool.subjectList.get(j).subjectName,
						Main.newSchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark
						));
			}
		}
		out.close();
		file.close();
		System.out.println("Serialized and saved!");
	} catch(Exception e) {
		System.out.println("ERROR!");
		e.printStackTrace();
		}
	}

}
