public class Student{
	String name;
	char sec;
	int roll;
	String course;
	int year;
	int sub1_marks;
	int sub2_marks;
	int sub3_marks;
	int sub4_marks;
	int sub5_marks;
	static int total_marks = 0;
	static int total_marks_sub1 = 0;
	static int total_marks_sub2 = 0;
	static int total_marks_sub3 = 0;
	static int total_marks_sub4 = 0;
	static int total_marks_sub5 = 0;
	static int no_of_students = 0;
	public Student(String n , char s , int r , String c , int y,int i , int ii , int iii , int iv , int v){
		this.name = n;
		this.sec = s;
		this.roll = r;
		this.course = c;
		this.year = y;
		this.sub1_marks = i;
		this.total_marks_sub1 = (this.total_marks_sub1 + i);
		this.sub2_marks = ii;
		this.total_marks_sub2 = this.total_marks_sub2 + ii;
		this.sub3_marks = iii;
		this.total_marks_sub3 = this.total_marks_sub3 + iii;
		this.sub4_marks = iv;
		this.total_marks_sub4 = this.total_marks_sub4 + iv;
		this.sub5_marks = v;
		this.total_marks_sub5 = this.total_marks_sub5 + v;
		this.total_marks = this.total_marks + ((i + ii +iii +iv +v)/5);
		this.no_of_students = this.no_of_students + 1;
		System.out.println("Student Details Registered");
	}
	public void update_student_info(String n , char s , int r , String c , int y){
		this.name = n;
		this.sec = s;
		this.roll = r;
		this.course = c;
		this.year = y;
		System.out.println("Student info Updated");
	}
	public void update_marks(int i , int ii , int iii , int iv , int v){
		int prev_avg = ((this.total_marks_sub1 + this.total_marks_sub2 + this.total_marks_sub3+ this.total_marks_sub4+ this.total_marks_sub5)/5);
		int new_avg = ((i+ii+iii+iv+v)/5);
		this.total_marks_sub1 = (this.total_marks_sub1 - this.sub1_marks + i);
		this.sub1_marks = i;
		this.total_marks_sub2 = (this.total_marks_sub2 - this.sub2_marks + ii);
		this.sub2_marks = ii;
		this.total_marks_sub3 = (this.total_marks_sub3 - this.sub3_marks + iii);
		this.sub3_marks = iii;
		this.total_marks_sub4 = (this.total_marks_sub4 - this.sub4_marks + iv);
		this.sub4_marks = iv;
		this.total_marks_sub5 = (this.total_marks_sub5 - this.sub5_marks + v);
		this.sub5_marks = v;
		if(new_avg<prev_avg)
			this.total_marks = this.total_marks - (prev_avg-new_avg);
		else if(new_avg>prev_avg)
			this.total_marks = this.total_marks + (new_avg-prev_avg);
		else
			return;
		System.out.println("Marks Updated");
	}
	public void deletion(int i){
		switch(i) {
		  case 1:
		    this.name = "\0";
		    System.out.println("Name Deleted");
		    break;
		  case 2:
		    this.sec = 'Z';
		    System.out.println("Section Name Deleted");
		    break;
		  case 3:
		    this.roll = -1;
		    System.out.println("Roll Number Deleted");
		    break;
		  case 4:
		    this.course = "\0";
		    System.out.println("Course Name Deleted");
		    break;
		  case 5:
		    this.year = -1;
		    System.out.println("Year of Study Deleted");
		    break;
		  case 6:
		    this.sub1_marks = -1;
		    System.out.println("Marks1 Deleted");
		    break;
		  case 7:
		    this.sub2_marks = -1;
		    System.out.println("Marks2 Deleted");
		    break;
		  case 8:
		    this.sub3_marks = -1;
		    System.out.println("Marks3 Deleted");
		    break;
		  case 9:
		    this.sub4_marks = -1;
		    System.out.println("Marks4 Deleted");
		    break;
		  case 10:
		    this.sub5_marks = -1;
		    System.out.println("Marks5 Deleted");
		    break;
		  case 11:
		    this.name = "\0";
		    this.sec = 'Z';
		    this.roll = -1;
		    this.course = "\0";
		    this.year = -1;
		    this.sub1_marks = 0;
		    this.sub2_marks = 0;
		    this.sub3_marks = 0;
		    this.sub4_marks = 0;
		    this.sub5_marks = 0;
		    System.out.println("Everything Deleted");
		    break;
		  default:
		  	System.out.println("Case Not Defined");
		}
	}	
	public void printer(){
		System.out.println("Subject 1 Avg marks = "+(this.total_marks_sub1/this.no_of_students));
		System.out.println("Subject 2 Avg marks = "+(this.total_marks_sub2/this.no_of_students));
		System.out.println("Subject 3 Avg marks = "+(this.total_marks_sub3/this.no_of_students));
		System.out.println("Subject 4 Avg marks = "+(this.total_marks_sub4/this.no_of_students));
		System.out.println("Subject 5 Avg marks = "+(this.total_marks_sub5/this.no_of_students));
		System.out.println("Student wise Avg marks = "+(this.total_marks/this.no_of_students));
	}
}
