class Triangle extends Shape{
	int Base , Height;
	public Triangle(int b , int h){
		this.Base = b;
		this.Height = h;
		calculateArea();
		display();
	}
	public void calculateArea(){
		this.Area = 0.5 * Base * Height;
	}
	public void display(){
		System.out.println("The Area of the Triangle is = "+Area);
	}	
}
		
