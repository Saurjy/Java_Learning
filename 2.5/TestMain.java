class TestMain{
	public static void main (String args[]){
		SavingsAccount S1 = new SavingsAccount("Saurjya","Kalindi","BULPC721A","8240102772",20000,30000);
		CurrentAccount S2 = new CurrentAccount("SaurjyaClone","Kalindi","BULPC721A","8240102772",30000);
		FixedDepositAccount F1 = new FixedDepositAccount("SaurjyaClone1","Kalindi","BULPC721A","8240102772",10,150,100000,4.9);
		RecurringDepositAccount R1 = new RecurringDepositAccount("SaurjyaClone2","Kalindi","BULPC721A","8240102772",10,150,100000,5.0);
		S1.display();
		S2.display();
		F1.display();
		R1.display();
	}
}
