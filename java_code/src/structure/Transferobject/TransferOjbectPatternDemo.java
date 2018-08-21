package structure.Transferobject;

public class TransferOjbectPatternDemo {

	public static void main(String[] args) {
		StudentsBO studentsBO = new StudentsBO();
		
		for (StudentTO stu:studentsBO.getAllStudents()) {
			System.out.println(String.format("get all student:[RollNo: %d ,Name: %s ]", stu.getRollNo(),stu.getName()));
		}
		
		StudentTO studentTO = studentsBO.getAllStudents().get(0);
		System.out.println(String.format("the student %d,%s will be delete", studentTO.getRollNo(),studentTO.getName()));
		studentsBO.deleteStudent(studentTO);
		
		
		StudentTO stu=studentsBO.getStudent(2);
		if (stu == null) {
			System.out.println("the student is not exist");
		}else {
			System.out.println(String.format("get student:[RollNo: %d , Name : %s]",stu.getRollNo(),stu.getName()));
		}
		
		
	
	}

}
