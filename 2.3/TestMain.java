class TestMain{
	public static void main (String args[]){
		
		int n = 4 , max = 0 , temp , flag = 0;
		Manager[] M = new Manager[n];
		M[0] = new Manager(100,007,"Saurjya","CSE",10000);
		M[1] = new Manager(50,007,"Satyam","CSE",9000);
		M[2] = new Manager(90,007,"Shuvam","CSE",11000);
		M[3] = new Manager(1000,007,"Satyaki","CSE",8000);
		for(int i = 0 ; i < n ; i++){
			temp = M[i].show_salary()+M[i].show_salary();
			if(temp>=max){
				max = temp;
				flag = i;
			}
			else
				continue;
		}
		System.out.println("The Person with the most paid salary is : ");
		M[flag].display();
	}
}
