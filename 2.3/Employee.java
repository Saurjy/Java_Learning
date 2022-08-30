class Employee{
	private int Id, Salary;
	private String Name, Department;
	public Employee(int id,String name,String dept,int sal){
		Id=id;
		Name=name;
		Department = dept;
		Salary = sal;
	}
	public int show_salary(){
		return Salary;
	}
	public String show_name(){
		return Name;
	}
}		
