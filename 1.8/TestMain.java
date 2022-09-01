class TestMain{
	public static void main(String args[]){
		ReservationSystem S1 = new ReservationSystem(100,48);//Enter the Capacity and no of seats booked till now
		S1.BookSeat("Saurjya",105);//Enter the Name and Price paid
		S1.PrintStats();
		S1.PrintTicket();
	}
}
		
