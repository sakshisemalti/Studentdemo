package Student;
import java.util.*;
public class StudentsMethod {
	public static void acceptStudentData(student[] ob) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=0;i<ob.length;i++) {
			System.out.println("Want to continue : Yes-1/No-0");
			int c= sc.nextInt();
			if(c==1) {
				System.out.println("Enter Id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter first subject marks");
				float m1=sc.nextFloat();
				System.out.println("Enter second subject marks");
				float m2=sc.nextFloat();
				System.out.println("Enter third subject marks");
				float m3=sc.nextFloat();
				ob[i]=new student(id,name,m1,m2,m3);
			}
			else {
				System.out.println("Thank you!");
				break;
			}
			
		}
		}
	
	public static student searchStudent(student ob[],int id) {
		for(int i=0;i<ob.length;i++) {
			if(ob[i].getId()==id) {
				return ob[i];
			}
		}
		return null;
	}
	
	public static void studentDisplay(student ob[]) {
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
	}

}
