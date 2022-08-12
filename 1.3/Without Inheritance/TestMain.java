public class TestMain{
	public static void main (String args[]){
		Transaction t1 = new Transaction(12345 , 50000 , 12 , 5 , 2001,40000, 1 , 2 , 4 , 2005);
		t1.Printer();
		Transaction t2 = new Transaction(67890 , 40000 , 1 , 8 , 2009,40000, 0 , 6 , 5 , 2010);
		t2.Printer();
		Transaction t3 = new Transaction(13579 , 150000 , 2 , 4 , 2005,200000, 1 , 9 , 6 ,2010);
		t3.Printer();
	}
}
