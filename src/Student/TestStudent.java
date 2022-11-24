package Student;
import java.util.*;
public class TestStudent {
	public static void main (String args[] ){
		Scanner sc=new Scanner(System.in);
		student[] stud =new student[10];
		
		i:while(true) {
		System.out.println("-------Student Management------");
		System.out.println("1. Enter student details");
		System.out.println("2. Find percentage and G.P.A");
		System.out.println("3. Find Student");
		System.out.println("4. Display all student");
		System.out.println("5. Exit");
		System.out.println("Enter your choice: ");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			StudentsMethod.acceptStudentData(stud);
			break;
			
		case 2: 
			System.out.println("Enter student id: ");
			int id = sc.nextInt();
			student s = StudentsMethod.searchStudent(stud, id);
			if(s ==null) {
				System.out.println("Id not found");
			}
			else {
				System.out.println("Id found");
				s.calcPercentage();
				System.out.println("Percentage is: "+s.getPercentage());
				System.out.println("Grade is: "+s.getGrade());
			}
			break;
		
		case 3:
			System.out.println("Enter student id: ");
			int id1 = sc.nextInt();
			student s1 = StudentsMethod.searchStudent(stud, id1);
			if(s1==null) {
				System.out.println("Id not found");
			}
			else {
				System.out.println("Id found");
				s1.calcPercentage();
				System.out.println("Percentage is: "+s1.getPercentage());
				System.out.println("Grade is: "+s1.getGrade());
				
			}
			break;
		
		case 4:
			StudentsMethod.studentDisplay(stud);
			break;
		
		case 5:
			break i;
		}
	}
	}

}
