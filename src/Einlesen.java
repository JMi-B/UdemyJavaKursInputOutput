import java.util.Scanner;

public class Einlesen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Klasse = Komplexer Datentyp
		//dort sind mehr als eine Information gespeichert
		//Methoden der Klassen Scanner 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben ");
		double zahl = scan.nextDouble();
		System.out.println("Ihre Zahl lautet: " + zahl);
		
		//Weitere Methoden der Klasse Scanner
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Geben sie ihren Namen ein: ");
		String zeichenkette = scan2.next();
		System.out.println("Bitte geben sie ihr Alter ein: ");
		int alter = scan2.nextInt();
		
		System.out.print("Ihr Name: " + zeichenkette + " Ihr Alter: " + alter);
	}

}
