class TestMain{
	public static void main (String args[]){
		Complex c1 = new Complex(10,7);
		Complex c2 = new Complex(5,-3);
		Complex c3 = new Complex();
		c1.addition(c2);
		c1.x = 10;
		c1.y = 7;
		c3.addition(c1,c2);
		c3.x = 0;
		c3.y = 0;
		c1.subtraction(c2);
		c1.x = 10;
		c1.y = 7;
		c3.subtraction(c1,c2);
		c3.x = 0;
		c3.y = 0;
		c3.multiplication(c1,c2);
		
		
		
	}
}
