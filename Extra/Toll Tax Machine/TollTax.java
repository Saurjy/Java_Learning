import java.util.Scanner;
class TollTax{
    private int TollRate = 50 , TotalCars;
    private String Name = "NarkelbaganTollTax";
    public TollTax(){
        Scanner obj = new Scanner(System.in);
        System.out.println("If You want to pay the toll tax press Y else N to exit");
        char X = obj.next().charAt(0);
        while(X != 'N'){
            System.out.println("Please Pay the Toll Tax of "+TollRate);
            System.out.print("Paid ");
            int payment = obj.nextInt();
            if(payment >= TollRate){
               System.out.println("Payment Successfull you may pass the bridge\nPaid "+payment+"\nExcess "+(payment-TollRate));
               TotalCars++;
            }
            else{
               System.out.println("Payment Failed Try Again!! \nYou Paid "+payment+"\nYou Need to Pay "+TollRate);
               continue;
            }
            System.out.println("Next Car Please .....(Y/N)");
            X = obj.next().charAt(0);
        }
    }
    public void set_Toll(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Set The New Toll Tax Rate");
        int toll = obj.nextInt();
        TollRate = toll;
        System.out.println("The New Toll Tax Rate is "+TollRate);
    }
    public void set_Name(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Set The New Toll Tax Name");
        String name = obj.nextLine();
        Name = name;
        System.out.println("The New Toll Tax Name is "+Name);
    }
    public int show_cars(){
        return TotalCars;
    }
    public String show_name(){
        return Name;
    }
    public int show_income(){
        return (TollRate*TotalCars);
    }
}		