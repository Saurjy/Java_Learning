class TestMain{
	public static void main (String args[]){
	   TollTax Manager = new TollTax();
	   System.out.println("Total Cars Crossed The Bridge Today = "+Manager.show_cars());
	   System.out.println("Total Income Today = "+Manager.show_income());
	}
}