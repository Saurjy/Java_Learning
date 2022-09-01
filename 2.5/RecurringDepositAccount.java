class RecurringDepositAccount extends DepositAccount{
	int Recurr_AMT;
	public RecurringDepositAccount(String N ,String Add ,String PA ,String PN ,int SD,int ED , int Dep , double R){
		super(N ,Add ,PA ,PN ,SD,ED);
		Recurr_AMT = Dep;
		ROI = R;
		Account_Type = "Recurring Deposit Account";
		Balance = Dep;
	}
	public void recurrcal(){
		
	}
}
