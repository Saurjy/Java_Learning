class TestMain{
	public static void main (String args[]){
		String Name = "X";
		if(Name == "S"){
			System.out.println("Name Starts with S");
			S SC1 = new ScientificCalculator(5.0);
			SC1.Expo();
			A BC1 = new BasicCalculator(10,5);
			BC1.Add();
			BC1.Sub();
		}
		else if(Name == "A"){
			System.out.println("Name Starts with A");
			A BC1 = new BasicCalculator(10,5);
			BC1.Add();
			BC1.Sub();
		}
		else{
			System.out.println("Name Starts with any other letter");
			S1 SC2 = new ScientificCalculator(5.0);
			SC2.Expo();
			SC2.Loga();
			A1 BC2 = new BasicCalculator(10,5);
			BC2.Add();
			BC2.Sub();
			BC2.Multiply();
			BC2.Divide();
			BC2.Moduolo();
		}
		
	}
}
