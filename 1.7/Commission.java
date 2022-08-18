public class Commission{
	String sales;
	public Commission(String s){
		this.sales = s;
		}
	public void getCommission(){
		int s = Integer.parseInt(this.sales);
		if(s > 0)
 		System.out.println("Sales = "+s);
		else
		System.out.println("Invalid Input");
		}
	}