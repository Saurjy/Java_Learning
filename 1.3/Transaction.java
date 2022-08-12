public class Transaction extends Account{
	int d_o_t;//Day of transaction
	int m_o_t;//Month of transaction
	int y_o_t;//Year of transaction
	int amount;
	int transaction_type;//0 -> Deposit 1-> Withdrawal
	int transaction_status;
	public Transaction(int acc_no , int bal , int d1,int m1 ,int y1 ,int amt , int trans_type ,int d2,int m2 ,int y2){
		super(acc_no,bal,d1,m1,y1);
		this.transaction_type = trans_type;
		this.amount = amt;
		this.d_o_t= d2;
		this.m_o_t= m2;
		this.y_o_t= y2;
		if (trans_type == 0){
			this.balance = balance+amt;
			this.transaction_status=0;
		}
		else if (trans_type == 1 && balance >= amt){
			this.balance = balance-amt;
			this.transaction_status=0;
		}
		else
			this.transaction_status=1;
	}
	public void Printer(){
		System.out.println("Account Number = "+account_number);
		System.out.println("Balance = "+balance);
		System.out.println("Last Update Date = "+l_u_d+":"+l_u_m+":"+l_u_y);
		System.out.println("Last Transaction Date = "+d_o_t+":"+m_o_t+":"+y_o_t);
		System.out.println("Last Transaction Amount = "+amount);
		if(transaction_type==0)
			System.out.println("Last Transaction was a Deposit");
		else
			System.out.println("Last Transaction was a Withdrawl");
		if(transaction_status==0)
			System.out.println("Last Transaction was Successful");
		else
			System.out.println("Last Transaction was UnSuccessful");
		System.out.println();
	}
}
