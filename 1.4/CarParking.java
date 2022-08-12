public class CarParking{
	String name_of_Multiplex="AVANI";
	int Charge_rate ;
	static int total_no_of_cars=0;
	static int d = 10;//Day
	static int m = 9;//Month
	static int y = 2022;//Year
	int charge = 10;
	int time_parked;
	static int todays_earn;
	public CarParking(int Charge_rate)
	{
		this.Charge_rate = Charge_rate;
		this.total_no_of_cars = total_no_of_cars + 1;
	}
	public void update_Charge_rate(int time)
	{
		this.time_parked = time;
		this.charge = time*this.Charge_rate;
		this.todays_earn = todays_earn + this.charge;
	}
	public void update_Date(int d,int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public void update_Multiplex_name(String name)
	{
		this.name_of_Multiplex = name;
	}
}			
