import java.util.*;
public class Student {
	Scanner sc5 = new Scanner(System.in);
	 public String studentName;
	 ArrayList<Subject> studentSubjectList = new ArrayList<Subject>();
	 
	 public void addStudent() {
		 boolean nameLoop = true;
			while (nameLoop) {
				System.out.println("Enter Student Name: ");
     		String inputName = sc5.next();
     		Student newStudent = new Student();
     		newStudent.studentName = inputName;
     		Main.newSchool.studentList.add(newStudent);
     		System.out.println("Do you want to add more names?");
     			String nameOption = sc5.next();
     			if (nameOption.equalsIgnoreCase("Y") || nameOption.equalsIgnoreCase("yes")) {
     			}
     			else if(nameOption.equalsIgnoreCase("N") || nameOption.equalsIgnoreCase("no")) {
     				nameLoop = false;
     			}
     			else {
						System.out.println("Invalid Input");
					}
			}
			//update students with subject
			for(int i=0; i<Main.newSchool.studentList.size(); i++) {
				for (int j=0; j<Main.newSchool.subjectList.size(); j++) {
					Subject mySubject = new Subject();
					mySubject.subjectName = Main.newSchool.subjectList.get(j).subjectName;
					Main.newSchool.studentList.get(i).studentSubjectList.add(mySubject);
				}
			}
	 }
}
