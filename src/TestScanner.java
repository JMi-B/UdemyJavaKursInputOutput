import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Mit der Klasse Scanner hat man Mertoden zur Verfügung 
		//um Eingabe-Ströme (InputStream) einzulesen
		//d.h. Werte wie Zahlen etc.
		
		Scanner scanner = new Scanner(System.in); // System.in = Input über Tastatur
		
		//Beispiel
		String name = scanner.nextLine();
		char sex = scanner.next().charAt(0); //next() nimmt Wort charAt() nimmt Zeichen an Indexstelle des Array
		int age = scanner.nextInt();
		Long mobileNumber = scanner.nextLong();
		
		scanner.close();
		
		System.out.println("Name: " + name);
		System.out.println("Geschlecht: " + sex);
		System.out.println("Age: " + age);
		System.out.println("Mobile Nummer: " + mobileNumber);
		
		//Was kann eingelesen werden
		
		//nextInt() - Int
		//nextFloat() - Float
		//nextDouble() - Double
		//nextLong() - Long
		//nextShort() - Short
		//next() - Einzelnes Wort
		//nextLine() - String "Zeichenkette"
		//nextBoolean() - Boolean
		

	}

}
