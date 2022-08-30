import java.util.Scanner;
class TestMain{
	public static void main (String args[]){
		int n = 5 , m = 10;
		String Name="";
		/*LightMotorVehicle[] lmvs = new LightMotorVehicle[n];
		for(int i = 0 ; i < n;i++){
			lmvs[i] = new LightMotorVehicle("Mahindra",2200000,2022,10245,15);
		}
		for(int i = 0 ; i < n;i++){
			System.out.println(lmvs[i]);
		}
		HeavyMotorVehicle[] hmvs = new HeavyMotorVehicle[m];
		for(int i = 0 ; i < m;i++){
			hmvs[i] = new HeavyMotorVehicle("Mahindra",2200000,2022,10245,15);
		}
		for(int i = 0 ; i < m;i++){
			System.out.println(hmvs[i]);
		}*///Testing Purpose
		Scanner temp = new Scanner(System.in);
    		System.out.println("Enter The Number of Light Motor Vehicles");
    		n = temp.nextInt();
    		LightMotorVehicle[] lmvs = new LightMotorVehicle[n];
    		for(int i = 0 ; i < n;i++){
    			System.out.println("Enter The Price");
    			double p = temp.nextDouble();
    			System.out.println("Enter The Name of the Company");
    			temp.nextLine();
    			Name = temp.nextLine();
    			System.out.println("Enter The Year of Manufacturing");
    			int y = temp.nextInt();
    			System.out.println("Enter The Chassis Number");
    			int cha = temp.nextInt();
    			System.out.println("Enter The Mileage");
    			double mil = temp.nextDouble();	
			lmvs[i] = new LightMotorVehicle(Name,p,y,cha,mil);
		}
		System.out.println("Enter The Number of Heavy Motor Vehicles");
    		m = temp.nextInt();
    		HeavyMotorVehicle[] hmvs = new HeavyMotorVehicle[n];
    		for(int i = 0 ; i < m;i++){
    			System.out.println("Enter The Name of the Company");
    			temp.nextLine();
    			Name = temp.nextLine();
    			System.out.println("Enter The Price");
    			double p = temp.nextDouble();
    			System.out.println("Enter The Year of Manufacturing");
    			int y = temp.nextInt();
    			System.out.println("Enter The Chassis Number");
    			int cha = temp.nextInt();
    			System.out.println("Enter The Capacity in Tons");
    			int cap = temp.nextInt();	
			hmvs[i] = new HeavyMotorVehicle(Name,p,y,cha,cap);
		}
		for(int i = 0 ; i < n;i++){
			System.out.println(lmvs[i]);
		}
		for(int i = 0 ; i < m;i++){
			System.out.println(hmvs[i]);
		}
	}
}
