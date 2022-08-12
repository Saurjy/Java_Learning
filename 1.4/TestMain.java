public class TestMain{
	public static void main (String args[]){
		Car t1 = new Car(2673 , 8);//Car Number and Entry Time
		Car t2 = new Car(1685 , 9);
		Car t3 = new Car(2473 , 9);
		Car t4 = new Car(2615 , 10);
		Car t5 = new Car(1058 , 12);
		t1.Exiter(12);//Exit Time
		t2.Exiter(13);
		t3.Exiter(14);
		System.out.println("Avani Multiplex's Parking Billing System\n");
		t1.Printer();//Printing the Bill of a car so that it may exit
		t2.Printer();
		t3.Printer();
		t4.Printer();
		t5.Printer();
		t1.Printer_stats();//Printing stats of that day for the parking lot
	}
}
