class SavingsAccount extends Account{
	int Transaction_Limit , Min_Balance;
	SavingsAccount(String N ,String Add ,String PA ,String PN , int TL , int bal){
		super(N,Add,PA,PN);
		Min_Balance = 5000;
		Transaction_Limit = TL;
		Account_Type = "Savings Account";
		Balance = bal;
		ROI = 4.0;
	}
	public void addmoney(int mon){
		Balance = Balance + mon;
		System.out.println("New Balance Rs."+Balance);
		
	}
	public void withdrawmoney(int mon){
		if(mon < Balance){
			Balance = Balance - mon;
			System.out.println("ATM Chucks Out Rs."+mon);
			System.out.println("New Balance Rs."+Balance);
		}
	}
	
}
