import java.util.Scanner;
class IfElseDemo {
	public static void main(String[] args) {
		int testScore;
		char grade;
		
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		testScore = inputValue.nextInt();
		
		if (testScore >= 90) {
			grade = 'A';
		} else {
			if (testScore >= 80) {
				grade = 'B';
			} else {
				if (testScore >= 70) {
					grade = 'C';
				} else {
					if (testScore >= 60) {
						grade = 'D';
					} else {
						grade = 'F';
					}
				}
			}
		}
		System.out.println("Grade =" + grade);
	}
}