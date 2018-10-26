import java.util.Date;

import javax.swing.JOptionPane;

public class Pi {

	// x = Anzahl der Iterationen
	public static int x = 1;

	// stellt  Hilfsvariabeln da
	public static double y = 1;
	public static double holder = 1;
	public static long start = new Date().getTime();

	// Am Anfang
	public static double pi = 0.00000001;

	// main Funktion
	public static void main(String[] args) {
		// löschen aller Steuerargumente
		if (args.length != 0) {
			args = null;
		}
		calcpi();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Pi = ");
		stringBuilder.append(pi);
		stringBuilder.append(" \n System-PI= ");
		stringBuilder.append(Math.PI);
		stringBuilder.append(" \n Durchläufe: ");
		stringBuilder.append(x);
		stringBuilder.append(" \n Dauer: ");
		stringBuilder.append(new Date().getTime() - start+"ms");
		JOptionPane.showMessageDialog(null, stringBuilder.toString(), "Bericht",
				JOptionPane.WARNING_MESSAGE);
		System.err.println(String.valueOf(stringBuilder));

	}

	// Funktion zur berechnung von Pi
	public static double calcpi() {

		do {
			y = x % 2 == 0 ? y = -4 / holder : +4 / holder;
			holder += 2;
			pi += y;
			x++;
			System.out.println(pi);
		} while (check(pi));
		return pi;
	}

	// überprüft ob die Annäherung erreicht ist
	public static boolean check(double pi) {
		return !(Math.abs(Math.PI-pi)<0.00000001);
		}
}