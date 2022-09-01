class CurrentAccount extends Account{
	int Min_Balance;
	CurrentAccount(String N ,String Add ,String PA ,String PN,int bal){
		super(N,Add,PA,PN);
		Min_Balance = 10000;
		Balance = bal;
		Account_Type = "Current Account";
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
