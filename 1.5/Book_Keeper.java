public class Book_Keeper{
	String name_of_Book;
	String name_of_Author;
	int no_of_copies = 0;
	public static int Total_no_of_books = 0;
	public Book_Keeper(String Book, String Author){
		this.name_of_Book = Book;
		this.name_of_Author = Author;
		this.no_of_copies = this.no_of_copies+1;
		this.Total_no_of_books = this.Total_no_of_books+1;
	}
	public Book_Keeper(Book_Keeper ob) {
        	this.name_of_Book = ob.name_of_Book;
		this.name_of_Author = ob.name_of_Author;
		ob.no_of_copies = ob.no_of_copies+1;
		this.Total_no_of_books = this.Total_no_of_books+1;
    	}
    	public void printer(){
    		System.out.println("Name of the Book : "+this.name_of_Book);
    		System.out.println("Name of the Author/s : "+this.name_of_Author);
    		System.out.println("No. of Copies Present : "+this.no_of_copies+"\n");
    	}
}
