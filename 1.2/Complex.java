class Complex{
	int x ; 
	int y ;
	public Complex(){
	}
	public Complex(int x , int y){
		this.x = x;
		this.y = y;
	}
	public void addition(Complex c2){
		x = x + c2.x;
		y = y + c2.y;
		System.out.print("Addition with the help of c1 : ");
		System.out.println(x+"+"+y+"i");
	}
	public void addition(Complex c1 , Complex c2){
		x = c1.x + c2.x;
		y = c1.y + c2.y;
		System.out.print("Addition with the help of c3 : ");
		System.out.println(x+"+"+y+"i");
	}
	public void subtraction(Complex c2){
		x = x - c2.x;
		y = y - c2.y;
		System.out.print("Subtraction with the help of c1 : ");
		System.out.println(x+"+"+y+"i");
	}
	public void subtraction(Complex c1 , Complex c2){
		x = c1.x - c2.x;
		y = c1.y - c2.y;
		System.out.print("Subtraction with the help of c3 : ");
		System.out.println(x+"+"+y+"i");
	}
	public void multiplication(Complex c1 , Complex c2){
		x = c1.x * c2.x + c1.y * c2.y;
		y = c1.x * c2.y + c1.y * c2.x;
		System.out.print("Multiplication with the help of c3 : ");
		System.out.println(x+"+"+y+"i");
	}
	
}
