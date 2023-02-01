import java.util.*;
public class SearchStudents {
	public void searchStudents() {
		Scanner sc3 = new Scanner(System.in);
		boolean searchLoop = true;
		while (searchLoop) {
			System.out.println("Enter the name:");
            String searchedName = sc3.next();
            for (int i = 0; i<Main.newSchool.studentList.size(); i++) {
            	if(Main.newSchool.studentList.get(i).studentName.equals(searchedName)) {
            		System.out.println("School name: " + Main.newSchool.schoolName);
            		System.out.println("Student name: " + Main.newSchool.studentList.get(i).studentName);
            		for (int j= 0; j<Main.newSchool.subjectList.size();j++) {
            			System.out.println(Main.newSchool.subjectList.get(j).subjectName + "Mark: " + 
            					Main.newSchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark);
            			searchLoop = false;
            		}                    		
            	}
            }
	}
	}
}
