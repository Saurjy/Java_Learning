class Rectangle extends Shape{
	int Length , Breadth;
	public Rectangle(int l , int b){
		this.Length = l;
		this.Breadth = b;
		calculateArea();
		display();
	}
	public void calculateArea(){
		this.Area = Length * Breadth;
	}
	public void display(){
		System.out.println("The Area of the Rectangle is = "+Area);
	}	
}
		
