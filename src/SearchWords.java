import java.io.File;
import java.io.FileReader;
import java.util.*;

public class SearchWords {
	Scanner sc2 = new Scanner(System.in);
	public void searchWords () {
		System.out.println("Enter the word you want to search for");
		String wordSearch = sc2.next();
		try {
			FileReader read = new FileReader(
					"C:" + File.separator +
					"Users" + File.separator +
					"Lenovo" + File.separator +
					"eclipse-workspace" + File.separator +
					"SchoolSystem-main" + File.separator +
					"src" + File.separator +
					"School.txt"
					);
			int i;
			int j = 0;
			int count = 0;
			while ((i = read.read())!= -1) {
				if((char)i == wordSearch.charAt(j)) {
					j++;
					if(j == wordSearch.length()-1) {
						count++;
						j = 0;
					}
				}
				else {
					j = 0;
				}
			}
			System.out.println("The word " + wordSearch + " Exists " + count + " times");
			read.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
