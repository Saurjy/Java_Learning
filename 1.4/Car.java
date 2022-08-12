public class Car extends CarParking{
	int car_no;
	int entry_time;
	int exit_time;
	static int max_time;
	static int curr_no_of_cars = 0;
	public Car(int car , int en_t)
		{	
			super(10);
			this.car_no = car;
			this.entry_time = en_t;
			this.curr_no_of_cars = curr_no_of_cars + 1;
		}
	public void Exiter(int ex_t)
		{	
			if(ex_t>this.max_time)
				this.max_time=ex_t;
			this.exit_time = ex_t;
			update_Charge_rate((this.exit_time-this.entry_time));
			this.curr_no_of_cars = curr_no_of_cars - 1;
		}
		
	public void Printer(){
		if(this.exit_time == 0)
			{
				System.out.println("Car Number = "+car_no);
				System.out.println("This car is still Parked");
				System.out.println("Time Parked = "+(this.max_time-this.entry_time)+" Hrs");
				System.out.println("Charge Rate = "+Charge_rate+" Per Hour");
				System.out.println("Bill Amount = ₹"+(this.Charge_rate*(this.max_time-this.entry_time)));
				System.out.println();
				return;
			}
		System.out.println("Car Number = "+car_no);
		System.out.println("Time Parked = "+time_parked+" Hrs");
		System.out.println("Charge Rate = "+Charge_rate+" Per Hour");
		System.out.println("Bill Amount = ₹"+charge);
		System.out.println();
		
	}
	public void Printer_stats(){
		System.out.println("Total Number of Cars Present = "+curr_no_of_cars);
		System.out.println("Total Number of Cars Parked = "+total_no_of_cars);
		System.out.println("Today's Date = "+d+":"+m+":"+y);
		System.out.println("Today's Earnings = ₹"+todays_earn);
		System.out.println();
	}
}
