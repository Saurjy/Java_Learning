class Teachers extends Person{
	int Year_join , Tenure , Salary;
	String Teach_ID , Courses , Dept ;
	public Teachers(String N ,String Ad ,String Pn , int YJ , int T , String T_ID , String C , String D , int S){
		Name = N;
		Addr = Ad;
		Ph_no = Pn;
		Year_join = YJ;
		Tenure = T;
		Teach_ID = T_ID;
		Courses = C;
		Dept = D;
		Salary = S;
	} 
	public String toString(){
  		return "Name = "+Name+" Address = "+Addr+" Phone Number = "+Ph_no+" Year of Joining = "+Year_join+" Tenure = "+Tenure+" Teacher ID = "+Teach_ID+" Courses Taught = "+Courses+" Department = "+Dept+" Salary = "+Salary;  
 	}  
}
		
