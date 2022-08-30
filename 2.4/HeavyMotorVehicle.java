class HeavyMotorVehicle extends Vehicle{
	int Capacity_Tons;
	public HeavyMotorVehicle(String N , double P , int Y , int Cha , int Cap){
		CompanyName=N;
		Price=P;
		Year_Man=Y;
		Chassis_No=Cha;
		Capacity_Tons=Cap;
	}
	public String toString(){
  		return "Vehicle No. "+vno+" Company Name = "+CompanyName+" Price = "+Price+" Year of Manufacture = "+Year_Man+" Chassis Number = "+Chassis_No+" Capacity = "+Capacity_Tons+" Tons";  
 	}  
	
}
		
