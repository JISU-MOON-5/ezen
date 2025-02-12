package p0212;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("문지수");
		s1.setGrade(3);
		s1.setSchoolName("동국");
		Student s2 = new Student();
		s2.setName("문대렬");
		s2.setGrade(2);
		s2.setSchoolName("성동");
		Student s3 = new Student();
		s3.setName("이지연");
		s3.setGrade(3);
		s3.setSchoolName("이젠");
		Student s4 = new Student();
		s4.setName("이정희");
		s4.setGrade(1);
		s4.setSchoolName("행당");
		Student s5 = new Student();
		s5.setName("최한빛");
		s5.setGrade(2);
		s5.setSchoolName("덕수");

		ArrayList<Student> student = new ArrayList<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);

		for (Student s : student) {
			String name = s.getName();
			String schoolName = s.getSchoolName();
			if(name.startsWith("최") || "이젠".equals(schoolName)) {  
				System.out.println(s);
			}
		}
	}
}
