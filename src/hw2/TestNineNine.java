package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		int i, j, k, l, m, n;

		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j = j + 1;
			}
			System.out.println();
		}

		System.out.println("\n============\n");

		for (k = 1; k <= 9; k++) {
			l = 1;
			do {
				System.out.print(k + "x" + l + "=" + k * l + "\t");
				l = l + 1;
			} while (l <= 9);
			System.out.println("");
		}

		System.out.println("\n============\n");

		m = 1;
		while (m <= 9) {
			n = 1;
			do {
				System.out.print(m + "x" + n + "=" + m * n + "\t");
				n = n + 1;
			} while (n <= 9);
			System.out.println("");
			m = m + 1;
		}

	}

}
