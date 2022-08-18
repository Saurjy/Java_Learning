import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		 Scanner myObj = new Scanner(System.in);
    		 System.out.println("Enter Sales");
		 String sales = myObj.nextLine();
 		 Commission s1 = new Commission(sales);
		 s1.getCommission();
		 }
	 }
		