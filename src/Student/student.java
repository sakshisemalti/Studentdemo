package Student;
public class student {
	private int id;
	private String name,grade;
	private float m1,m2,m3;
	private float percentage;
	 public student() {
		 this.id =0;
		 this.name = null;
		 this.m1=0;
		 this.m2=0;
		 this.m3 =0;
	 }
	 public student(int id,String name,float m1,float m2,float m3) {
		 this.id =id;
		 this.name =name;
		 this.m1=m1;
		 this.m2= m2;
		 this.m3=m3;
	 }
	 
	 //calculate percentage and grade
	 public void calcPercentage() {
		 percentage = (m1+m2+m3)/100;
		 if(this.percentage>=80) {
			 System.out.println("Grade A");
			 this.grade="A";
		 }
		 else if(this.percentage>=70 && this.percentage<80) {
			 System.out.println("Grade B");
			 this.grade="B";
		 }
		 else if(this.percentage<70 && this.percentage<=60) {
			 System.out.println("Grade C");
			 this.grade="C";
		 }
		 else if(this.percentage<60 && this.percentage>=50) {
			 System.out.println("Grade D");
			 this.grade="D";
		 }
		 else {
			 System.out.println("Fail");
			 this.grade ="Fail";
		 }
	 }
	 
	 public float getPercentage() {
		 return percentage;
	 }
	 
	 public String getGrade() {
		 return this.grade;
	 }
	 public int getId() {
		 return id;
	 }
	 
	 public String toString() {
		 return "Id: "+this.id+"Name: "+this.name+"First subject marks: "+this.m1+"Second subject marks: "+m2+"Third subject marks: "+m3;
	 }

}
