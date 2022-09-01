abstract class Account{
	static int Account_No_Assigner=1000000;
	int Account_No , Balance ;
	double ROI;
	String Name , Address , PAN_ID , Phone_Number , Account_Type;
	Account(String N ,String Add ,String PA ,String PN){
		Name = N;
		Address = Add;
		PAN_ID = PA;
		Phone_Number = PN;
		Account_No = ++Account_No_Assigner;
	}
	public void display(){
		System.out.println("Name = "+Name);
		System.out.println("Account Number = "+Account_No);
		System.out.println("Account Type = "+Account_Type);
		System.out.println("Balance = "+Balance);
		System.out.println("Phone Number = "+Phone_Number+"\n");
	}
}
