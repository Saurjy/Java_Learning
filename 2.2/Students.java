class Students extends Person{
	int Roll ,Year_add , Year_grad ;
	String Stud_ID ;
	String Courses; 
	String Dept;
	String Sec; 
	String Fees_Paid;
	public Students(String N ,String Ad ,String Pn , int r , int YA , int YG , String S_ID , String Cs , String D , String S ,String FS){
		Name = N;
		Addr = Ad;
		Ph_no = Pn;
		Roll = r;
		Year_add = YA;
		Year_grad = YG;
		Stud_ID = S_ID;
		Courses = Cs;
		Dept = D;
		Sec = S;
		Fees_Paid = FS;
	}
	public String toString(){
  		return "Name = "+Name+" Address = "+Addr+" Phone Number = "+Ph_no+" Roll Number = "+Roll+" Year of Addmission = "+Year_add+" Year of Graduation = "+Year_grad+" Student ID = "+Stud_ID+" Courses = "+Courses+" Department = "+Dept+" Sec = "+Sec+" Fees Paid = "+Fees_Paid;  
 	}  
	
}
		
