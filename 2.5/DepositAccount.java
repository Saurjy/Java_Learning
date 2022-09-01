abstract class DepositAccount extends Account{
	int Start_Date , End_Date ,Tenure;
	public DepositAccount(String N ,String Add ,String PA ,String PN ,int SD,int ED){
		super(N ,Add ,PA ,PN);
		Start_Date = SD;
		End_Date = ED;
		Tenure = ED - SD;
	}
}
