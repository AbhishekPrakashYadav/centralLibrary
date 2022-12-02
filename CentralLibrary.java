package Library;

class Library{
	String[] books;
	int no_of_books;
	Library(){
		this.books= new String[100];
		this.no_of_books=0;
	}
	void addBook(String book){
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book + " has been newly added!");
		System.out.println();
	}
	void showAvailableBooks(){
		System.out.println("Available books are:");
		System.out.println("********************");
		System.out.println();
		for(String book : this.books){
			if (book==null){
				continue;
			}
			System.out.println("* " +book);
			System.out.println();
		}
	}
	void issueBook(String book){
		for (String b :this.books){
			for(int i=0;i<this.books.length;i++){
			if (this.books[i].equals(book)){
				System.out.println("The book has been issued!!");
				System.out.println("--------------------------");
				System.out.println();
				this.books[i]= null;
				return;
			}
		}
			System.out.println("--------------------------");
			System.out.println("This book does not exist!!");
			System.out.println("--------------------------");
			System.out.println();
	}
}
	 void returnBook(String book) {
		this.books[no_of_books] =book;
		 System.out.println(book + " Book returned!!");
		 System.out.println();
	}
}

public class CentralLibrary {

	public static void main(String[] args) {
		Library centralLibrary = new Library();
		centralLibrary.addBook("Think and Grow Rich");
		centralLibrary.addBook("Algorithms");
		centralLibrary.addBook("C++");
		centralLibrary.showAvailableBooks();
		centralLibrary.issueBook("C++");
		centralLibrary.showAvailableBooks();
		centralLibrary.returnBook("C++");
		centralLibrary.showAvailableBooks();

	}

}
