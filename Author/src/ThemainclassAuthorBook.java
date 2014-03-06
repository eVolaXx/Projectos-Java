import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Author a;
		//a = Author.inputAuthor(input);
		//System.out.println(a);
		Book b = Book.inputBook(input);
		System.out.println(b);
		input.close();
	}

}

