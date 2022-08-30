class Manager extends Employee{
	private int Bonus;
	public Manager(int b,int id,String name,String dept,int sal){
		super(id,name,dept,sal);
		Bonus = b;
	}
	public int show_bonus(){
		return Bonus;
	}
	public void display(){
		System.out.println("Name = "+show_name()+" Total Salary = "+(show_salary()+Bonus));
	}
}		
