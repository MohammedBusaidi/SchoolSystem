import java.util.*;

public class Mark {
	public double mark;
	Scanner sc4 = new Scanner(System.in);
	
	public void addMarks() {
		boolean gradeLoop = true;
		while(gradeLoop) {
			if (Main.newSchool.studentList.size() == 0) {
				System.out.println("There are no students!");
				break;
			}
			else if (Main.newSchool.subjectList.size() == 0) {
				System.out.println("There are no subjects!");
				break;
			}
			//print the student names
			for(int i=0; i<Main.newSchool.studentList.size();i++) {
				System.out.println("("+(i+1)+")" + Main.newSchool.studentList.get(i).studentName);
			}
			System.out.println("Enter the number of the student: ");
			int studentNum;
				if (sc4.hasNextInt()) {
					studentNum = sc4.nextInt();
					if (studentNum < 1 || studentNum > Main.newSchool.studentList.size()) {
						System.out.println("Invalid number");
					}
					else {
						boolean stdSubLoop = true;
						while (stdSubLoop) {
							//print the subjects
							for(int i =0; i<Main.newSchool.subjectList.size();i++) {
								System.out.println("("+(1+i)+")" + Main.newSchool.subjectList.get(i).subjectName);
							}
							System.out.println("Enter the number of the subject");
							String enterSubject = sc4.next();
							try {
								Integer subjectNum = Integer.parseInt(enterSubject);
								if(subjectNum < 1 || subjectNum > Main.newSchool.subjectList.size()) {
									System.out.println("Inavlid number for subject");
									break;
								}
								else {
									//print enter marks
									if(subjectNum < Main.newSchool.subjectList.size() || subjectNum > 0) {
										System.out.println("Enter Marks :");
										String enterMark = sc4.next();
										try {
											double studMark = Double.parseDouble(enterMark);
											if(studMark < 0 || studMark > 100) {
												System.out.println("Invalid Mark" + studMark);
												break;
											}
											else {
												Main.newSchool.studentList.get(studentNum-1).studentSubjectList.get(subjectNum-1).studentMark.mark = studMark;
												while(true) {
													System.out.println("Do you want to add marks for other subjects?");
													String subjectSelect = sc4.next();
													if(subjectSelect.equalsIgnoreCase("Y") || subjectSelect.equalsIgnoreCase("yes")) {
														break;
													}
													else if(subjectSelect.equalsIgnoreCase("N") || subjectSelect.equalsIgnoreCase("no")) {
														stdSubLoop = false;
														while (true) {
															System.out.println("Do you want to enter marks for another student?");
															String subjectSelect1 = sc4.next();
															if(subjectSelect1.equalsIgnoreCase("Y") || subjectSelect1.equalsIgnoreCase("yes")) {
																break;
															}
															else if(subjectSelect1.equalsIgnoreCase("N") || subjectSelect1.equalsIgnoreCase("no")) {
																break;
															}
															else {
																System.out.println("Invalid!");
															}
														}
														break;
													}
													else {
														System.out.println("Invalid!");
													}
												}
											}
										} 
										catch (NumberFormatException ex) {System.out.println("Invalid!");}
									}
								}
							} 
							catch(NumberFormatException ex) {System.out.println("Invalid!");}
						}
					}
				}
				else {
					System.out.println("Invalid Input");
                    break;
				}
			System.out.println("[1] Select Student");
    		System.out.println("[2] Go Back");
    		int gradeOption = sc4.nextInt();
    			if (gradeOption == 1) {
    				for(int i=0; i<Main.newSchool.studentList.size(); i++) {
    					System.out.println(Main.newSchool.studentList.get(i).studentName);
    				}
    			}
    			else if(gradeOption == 2) {gradeLoop = false;}
		}
	}
}
