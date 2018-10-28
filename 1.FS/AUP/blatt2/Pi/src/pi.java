
public class pi {

	// main Funktion
	public static void main(String[] args) {

		System.out.println("Pi: " + calcpi(0.00000001)[0]);
		System.out.println("Iteration: " + calcpi(0.00000001)[1]);
	}

	// Funktion zur berechnung von Pi
	public static double[] calcpi(double accuracy) {
		double pi_old = 0.0;
		double[] result = { 4.0, 0.0 };
		double delta;
		while (true) {
			delta = Math.abs(result[0] - pi_old);
			if (delta < accuracy) {
				result[1] += 1; // weil wir mit 4.0 starten also eine Iteration ausgelassen haben!
				return result;
			}

			if (((result[1] + 1.0) % 2) == 0) {
				pi_old = result[0];
				result[1]++;
				result[0] += 4.0 / (2.0 * result[1] + 1.0);

			} else {
				pi_old = result[0];
				result[1]++;
				result[0] -= 4.0 / (2.0 * result[1] + 1.0);

			}
		}
	}
}
