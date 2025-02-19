import java.util.Scanner;

public class Einlesen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		//Aufgabe
		/*Erstelle erneut ein objekt der Klasse Scanner
		 * und lese 2 Werte mit hilfe dieser Klasse ein
		 * 
		 *  1. ist eine Ganzzahl, die Zahl soll das Alter sein
		 *  2. ist eine Zeichenkette(String), dein Name
		 *  
		 *  Am ende soll dein Alter und dein Name in der Konsole ausgegeben werden
		 *  System.ou.println("");
		 */
		Scanner scan1 = new Scanner(System.in);
		//System.out.println("Bitte gib dein Alter ein ");// ohne Abfrag bleib das Terminal erstmal leer
		int alter = scan1.nextInt();
		//System.out.println("Bitte gib einen Namen ein");// ohne Abfrag bleib das Terminal erstmal leer
		String name = scan1.next();
		
		System.out.println("Du heißt " + name + " und bist " + alter + " Jahre alt.");
		
	}

}
