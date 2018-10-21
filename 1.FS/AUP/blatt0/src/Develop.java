
public class Develop {

	// bitte geben sie an welche Aufgabe sie ausführen wollen

	public static String lvl = "a"; // a,b,c,d,e,f

	public static void main(String[] args) {
		switch (lvl) {
		case "a":
			System.out.println("Aufgabe 1a: \n");
			AufgabeA();
			break;
		case "b":
			System.out.println("Aufgabe 1b \n");
			AufgabeB(args);
			break;
		case "c":
			System.out.println("Aufgabe 1c \n");
			AufgabeC(args);
		default:
			break;
		}

	}

	public static void AufgabeA() {
		System.out.println("Hello World!!!");
		System.exit(0);
	}

	public static void AufgabeB(String lvl[]) {
		if (lvl.length == 2) {
			String vorname = lvl[0];
			String nachname = lvl[1];
			System.out.println("Hallo " + nachname + " " + vorname);
		} else {
			System.out.println("Falsche Eingabe");
		}
		System.exit(0);
	}

	public static void AufgabeC(String lvl[]) {

	}
}
