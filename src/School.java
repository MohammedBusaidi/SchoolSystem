import java.util.*;
import java.io.*;
public class School implements Serializable {
	public String schoolName;
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
}