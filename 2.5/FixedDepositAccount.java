class FixedDepositAccount extends DepositAccount{
	int Deposit_AMT;
	public FixedDepositAccount(String N ,String Add ,String PA ,String PN ,int SD,int ED,int Dep, double R){
		super(N , Add ,PA ,PN ,SD, ED);
		Deposit_AMT = Dep;
		ROI = R;
		Account_Type = "Fixed Deposit Account";
		Balance = Dep;
	}
	public void fixedcal(){
		
	}
}
