import java.util.Scanner;

class Author {

    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public String toString() {
        return getName() + " (" + getGender() + ") " + "at " + getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public static Author inputAuthor(Scanner input) {
    	String name = null;
    	String email = null;
    	char gender;
    	do {
    		System.out.println("Enter name:");
    		name = input.nextLine();
    	} while ((name.equals("")));
    	System.out.println("Enter email:");
    	email=input.nextLine();
    	do {
    		System.out.println("Enter gender (m/f):");
    		gender = input.nextLine().toLowerCase().charAt(0);
    	} while (!((gender=='m') || (gender=='f')));
    	//input.close();
    	return new Author(name,email,gender);
    }
}










