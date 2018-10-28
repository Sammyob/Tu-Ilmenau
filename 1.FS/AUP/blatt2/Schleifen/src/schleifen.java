
public class schleifen {

	// gegebenes a Array
	public static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static int erg = 0;
	protected static int x = 0;

	// Main Funktion
	public static void main(String[] args) {
		System.out.println("For-Schleife: ");
		forschleife();

		System.out.println("While-Schleife: ");
		whileschleife();

		System.out.println("For-While-Schleife. ");
		fwschleife();

	}

	public static void forschleife() {
		for (x = 0; x <= a.length - 1; x++) {
			erg += a[x];
		}
		System.out.println("\t Ergebnis: " + erg);
	}

	public static void whileschleife() {
		x = erg = 0;
		while (x != a.length) {

			erg += a[x];
			x += 1;
		}
		System.out.println("\t Ergebnis: " + erg);
	}

	public static void fwschleife() {
		x = erg = 0;
		do {
			erg += a[x];
			x += 1;

		} while (x != a.length);
		System.out.println("\t Ergebnis: " + erg);
	}

}
