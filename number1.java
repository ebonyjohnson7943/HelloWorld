import java.util.Scanner;
public class number1 {

	public static void main(String[] args) {
	int x = 10;
	Scanner scanner = new Scanner(System.in);
if (x%2==0) {
	System.out.println("What is your favorite flavor of ice cream?");
	
	String flavor = scanner.nextLine();
	
	scanner.close();
	
	System.out.println("I like " + flavor + ". But my favorite flavor is vanilla");
	
	}
else {
	System.out.println("Have a good day!");
}
	}
}
	

