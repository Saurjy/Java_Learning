class LightMotorVehicle extends Vehicle{
	double Mileage;
	public LightMotorVehicle(String N , double P , int Y , int Cha , double Mil){
		CompanyName=N;
		Price=P;
		Year_Man=Y;
		Chassis_No=Cha;
		Mileage=Mil;
	}
	public String toString(){
  		return " Vehicle No. "+vno+" Company Name = "+CompanyName+" Price = "+Price+" Year of Manufacture = "+Year_Man+" Chassis Number = "+Chassis_No+" Mileage = "+Mileage+" KM/L";  
 	}  
	
}
