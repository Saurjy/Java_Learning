class BasicCalculator implements A,A1{
	int x , y , Result;
	BasicCalculator(int a , int b){
		x = a;
		y = b;
	}
	public void Add(){
		Result = x+y;
		System.out.println("The Addition Result is = "+Result);
	}
	public void Sub(){
		Result = x-y;
		System.out.println("The Subtraction Result is = "+Result);
	}
	public void Multiply(){
		Result = x*y;
		System.out.println("The Mutliply Result is = "+Result);
	}
	public void Divide(){
		Result = x/y;
		System.out.println("The Divition Result is = "+Result);
	}
	public void Moduolo(){
		Result = x%y;
		System.out.println("The Moduolo Result is = "+Result);
	}
	
}
		
