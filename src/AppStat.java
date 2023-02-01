
public class AppStat {
	int mainMenueCount = 0;
	int setupCount = 0;
	int schoolNameCount = 0;
	int enterSubjectCount = 0;
	int enterStudentCount = 0;
	int enterGradeCount =0;
	int printCount = 0;
	int searchCount = 0;
	int saveFileCount = 0;
	int saveFolderCount = 0;
	int searchWordCount = 0;
	
	public void appStat() {
		System.out.println("Setup School ---> " + setupCount);
		System.out.println("   		Enter School Name ---> " + schoolNameCount);
		System.out.println("   		Enter Subject ---> " + enterSubjectCount);
		System.out.println("Enter Student Name ---> " + enterStudentCount);
		System.out.println("Enter Grade  ---> " + enterGradeCount);
		System.out.println("Print All  ---> " + printCount);
		System.out.println("Search Students  ---> " + searchCount);
		System.out.println("Save to file  ---> " + saveFileCount);
		System.out.println("Save to folder  ---> " + saveFolderCount);
		System.out.println("Search word  ---> " + searchWordCount);
	}
}
