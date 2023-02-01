import java.util.Scanner;

public class Menue {
	void showMenue() {
		System.out.println("Select Action");
		System.out.println("_________________");
		System.out.println("[1] Setup School");
		System.out.println("[2] Enter Students");
		System.out.println("[3] Enter Grade");
		System.out.println("[4] Print All");
		System.out.println("[5] Search Students");
		System.out.println("[6] App Statistics");
		System.out.println("[7] Save to file");
		System.out.println("[8] Save to folder");
        System.out.println("[9] Serialize");
        System.out.println("[10] DeSerialize");
        System.out.println("[11] Search Word");
        System.out.println("[12] Exit");
        System.out.println("_________________");
	}
	
	void showSubMenue() {
		boolean subMenueLoop = true;
		while (subMenueLoop) {
		System.out.println("[1] Enter school name");
		System.out.println("[2] Enter subject");
		System.out.println("[3] Go back");
		
		Scanner sc6 = new Scanner(System.in);
		int subMenueInput = sc6.nextInt();
		
			if (subMenueInput == 1) {
				Main.newStat.schoolNameCount = Main.newStat.schoolNameCount + 1;
				System.out.println("Enter school name: ");
				String inputSchool = sc6.next();
				Main.newSchool.schoolName = inputSchool;
			}
			else if (subMenueInput == 2) {
				Main.newStat.enterSubjectCount = Main.newStat.enterSubjectCount + 1;
				boolean subjectLoop = true;
				while (subjectLoop) {
					System.out.println("Enter subject: ");
					String inputSubject = sc6.next();
					Subject newSubject = new Subject();
					newSubject.subjectName = inputSubject;
					Main.newSchool.subjectList.add(newSubject);
					System.out.println("Do you want to add more subjects?");
						String subjectOption = sc6.next();
						if (subjectOption.equalsIgnoreCase("Y") || subjectOption.equalsIgnoreCase("yes")) {
    					}
    					else if(subjectOption.equalsIgnoreCase("N") || subjectOption.equalsIgnoreCase("no")) {
    						subjectLoop = false;
    					}
    					else {
    						System.out.println("Invalid Input");
    					}
				}
			}
			else if (subMenueInput == 3) {subMenueLoop = false;}
	}
}
}