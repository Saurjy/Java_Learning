class ScientificCalculator implements S,S1{
	double x , Result;
	ScientificCalculator(double a){
		x = a;
	}
	public void Expo(){
		Result = Math.exp(x);
		System.out.println("The Exponential Result is = "+Result);
	}
	public void Loga(){
		Result = Math.log10(x);
		System.out.println("The Logarithmic Result is = "+Result);
	}
}
		
