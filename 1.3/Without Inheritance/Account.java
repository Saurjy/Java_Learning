class Account{
	int account_number;
	int balance;
	int l_u_d;//Last Update Day
	int l_u_m;//Last Update Month
	int l_u_y;//Last Update Year
	public Account(int act , int bal ,int d,int m ,int y){
		this.account_number = act;
		this.balance = bal;
		this.l_u_d= d;
		this.l_u_m= m;
		this.l_u_y= y;	
	}
	public void Printer(){
		System.out.println("Account Number = "+account_number);
		System.out.println("Balance = "+balance);
		System.out.println("Last Update Date = "+l_u_d+":"+l_u_m+":"+l_u_y);
		}
}			
