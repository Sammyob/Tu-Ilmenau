
public class Einmaleins {

	// Vars
	public static int i = 5;
	public static double d = 0;
	public static boolean b = true;

	// Funktion zur allgemeinen Abfrage
	public static void abfrage() {
		System.out.println("i = " + i);
		System.out.println("d = " + d);
		if (b) {
			System.out.println("b = true");
		} else {
			System.out.println("b = false");
		}
	}

	public static void main(String[] args) {
		System.out.println(" \n Schritt 1: d = ++i");
		d = ++i;
		abfrage();

		System.out.println(" \n Schritt b: d = i--");
		d = i--;
		abfrage();

		System.out.println(" \n Schritt c: d = i++ - 3;");
		d = i++ - 3;
		abfrage();

		System.out.println(" \n Schritt d: b = !(true || i++ > 0);");
		System.err.println("i++ >0 wird nie genutzt \n");
		b = !(true || i++ > 0);
		abfrage();

		System.out.println(" \n Schritt e: d = 3 + i / 4;");
		d = 3 + i / 4;
		abfrage();

		System.out.println(" \n Schritt f: i = b ? i : i * i;");
		i = b ? i : i * i;
		abfrage();

	}

}