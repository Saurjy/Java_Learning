public class TestMain {
 
    public static void main(String[] args) {
        Book_Keeper B1 = new Book_Keeper("Handbook of DATA STRUCTURES and APPLICATIONS", "CHAPMAN & HALL/CRC");//Purchase of New Book
        Book_Keeper B2 = new Book_Keeper("Operating System Concepts 8th Edition","Silberschatz , Galvin , Gagne" );
        Book_Keeper B3 = new Book_Keeper("Software Engineering A Practitioner's Approach", "Roger S. Pressman , Bruce R. Maxim");
        Book_Keeper B4 = new Book_Keeper("Compilers Principles , Techniques & Tools Second Edition", "Alfred V. Aho , Monica S. Lam , Ravi Sethi , Jeffrey D. Ullman");
        Book_Keeper B5 = new Book_Keeper("The Java Programming Language , Fourth Edition", "Key Arnold , James Gosling , David Holmes");
        // copy constructor call
        Book_Keeper B1C1 = new Book_Keeper(B1);//Purchase of Existing Book
        Book_Keeper B1C2 = new Book_Keeper(B1);
        Book_Keeper B2C1 = new Book_Keeper(B2);
        Book_Keeper B3C1 = new Book_Keeper(B3);
        Book_Keeper B3C2 = new Book_Keeper(B3);
        Book_Keeper B3C3 = new Book_Keeper(B3);
        Book_Keeper B4C1 = new Book_Keeper(B4);
        Book_Keeper B4C2 = new Book_Keeper(B4);
        Book_Keeper B4C3 = new Book_Keeper(B4);
        Book_Keeper B4C4 = new Book_Keeper(B4);
        Book_Keeper B5C1 = new Book_Keeper(B5);
        Book_Keeper B5C2 = new Book_Keeper(B5);
        B1.printer();
        B2.printer();
        B3.printer();
        B4.printer();
        B5.printer();
        System.out.println("Total No. of Books Present : "+B5.Total_no_of_books+"\n");
    }
}
