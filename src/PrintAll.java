
public class PrintAll {
	public void printAll() {
		System.out.println("======================================================================================");
        System.out.printf("%20s %20s %20s %20s\n", "School Name", "Student Name", "Subject", "Mark");
        System.out.println("======================================================================================");
        for (int i =0; i<Main.newSchool.studentList.size();i++) {
        	for (int j=0; j<Main.newSchool.subjectList.size();j++) {
        		System.out.printf("%20s %20s %20s %20s\n",
        				Main.newSchool.schoolName,
        				Main.newSchool.studentList.get(i).studentName,
        				Main.newSchool.subjectList.get(j).subjectName,
        				Main.newSchool.studentList.get(i).studentSubjectList.get(j).studentMark.mark);
        	}
        	System.out.println("--------------------------------------------------------------------------------------");
        }
	}
}
