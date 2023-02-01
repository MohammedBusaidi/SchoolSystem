import java.util.*;     
public class Main {
	static School newSchool = new School();
	static Menue mainMenue = new Menue();
	static AppStat newStat = new AppStat();
	
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc1 = new Scanner(System.in);
		SearchStudents searchStud = new SearchStudents();
		SaveDataToFile saveFile = new SaveDataToFile();
		SaveDataToFolder saveFolder = new SaveDataToFolder();
		Serialize serialized = new Serialize();
		DeSerialize deSerialized = new DeSerialize();
		SearchWords searchword = new SearchWords();
		PrintAll printAll = new PrintAll();
		Mark addMark = new Mark();
		Student addStud = new Student();
		Menue subM = new Menue();
		
		boolean menueLoop = true;
		while (menueLoop) {
			newStat.mainMenueCount = newStat.mainMenueCount + 1;
			mainMenue.showMenue();
			int menueInput = sc1.nextInt();
			switch(menueInput) {
			case 1:
				newStat.setupCount = newStat.setupCount + 1;
				subM.showSubMenue();
				break;
				
			case 2:
				//Enter student name
				newStat.enterStudentCount = newStat.enterStudentCount + 1;
				addStud.addStudent();
				break;
				
			case 3:
				//add marks
				newStat.enterGradeCount = newStat.enterGradeCount + 1;
				addMark.addMarks();
				break;
				
			case 4:
				//print all
				newStat.printCount = newStat.printCount + 1;
				printAll.printAll();
				break;
				
			case 5:
				//search students
				newStat.searchCount = newStat.searchCount + 1;
				searchStud.searchStudents();
				break;
				
			case 6:
				//App statistics
				newStat.appStat();
				break;
				
			case 7: 
				//save class in a text file
				newStat.saveFileCount = newStat.saveFileCount + 1;
				saveFile.saveData();
				break;
				
			case 8:
				//save to folder
				newStat.saveFolderCount = newStat.saveFolderCount + 1;
				saveFolder.saveDataFolder();
				break;
				
			case 9:
				//Serialize
				newStat.serializeCount = newStat.serializeCount + 1;
				serialized.serialize();
				break;
				
			case 10: 
				//DeSerialize
				deSerialized.deSerialize();
				break;
				
			case 11:
				//search for words in a file
				newStat.searchWordCount = newStat.searchWordCount + 1;
				searchword.searchWords();
				break;
				
			case 12:
				//Exit
				System.out.println("GOOD BYE");
				menueLoop = false;
				break;
		}
	}
}}

