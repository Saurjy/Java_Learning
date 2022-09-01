public class ReservationSystem{
	String Name;
	int Capacity , SeatNo, Paid;
	static int SeatsBooked , Price = 100;
	public ReservationSystem(int Cap , int SB){
		SeatsBooked = SB; 
		Capacity = Cap;
		Name = "NULL";
		Price = 100;
		}
	public void BookSeat(String N , int P){
			if(P >= Price && SeatsBooked < Capacity)
			{
				Name = N;
				Paid = P;
				SeatNo = ++SeatsBooked;
			}
		}
	public void SetPrice(int P){
		Price = P;
	}
	public void PrintStats(){
		System.out.println("Total Capacity = "+Capacity+"\nNo of Seats Booked = "+SeatsBooked+"\nNo of Seats Available = "+(Capacity-SeatsBooked));
	}
	public void PrintTicket(){
		System.out.println("Name of the traveller = "+Name+"\nPrice of the ticket = "+Price+"\nPaid = "+Paid+"\nSeat no allocated = "+SeatNo);
	}
	}
