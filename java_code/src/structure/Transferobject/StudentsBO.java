package structure.Transferobject;

import java.util.ArrayList;
import java.util.List;

public class StudentsBO {
	List<StudentTO> students;

	public StudentsBO() {
		students  = new ArrayList<StudentTO>();
		StudentTO stu1 = new StudentTO("robert", 1);
		StudentTO stu2 = new StudentTO("john",2);
		students.add(stu1);
		students.add(stu2);
		
	}
	
	public void deleteStudent(StudentTO stu) {
		students.remove(stu);
		System.out.println(String.format("students %d deleted from database", stu.getRollNo()));
		
	}
	
	public List<StudentTO> getAllStudents() {
		return students;
	}
	
	public StudentTO getStudent(int rollNo) {
		for (StudentTO stu : students) {
			if (stu.getRollNo() == rollNo) {
				return stu;
			}
		}
		return null;
	}
	
	public void updateStudent(StudentTO stu) {
		students.get(stu.getRollNo()).setName("linken");
		System.out.println(String.format("student:Roll No %d,updated in database", stu.getRollNo()));
		
	}


}
