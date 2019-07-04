package repl.it;

public class _236_commonDivisor {

	public static void main(String[] args) {
		System.out.println(commonDivisor(15, 25)); // 5
		System.out.println(commonDivisor(40, 124)); // 4
		System.out.println(commonDivisor(120, 60)); // 60
		System.out.println(commonDivisor(80, 60)); // 20
	}

	public static int commonDivisor(int m, int n) {
		// WRITE YOUR CODE HERE
		int comDiv = 1;

		int until = (m < n) ? m : n;

		for (int i = 1; i <= until; i++) {
			if (m % i == 0 && n % i == 0) {
				comDiv = i;
			}
		}

		return comDiv;
	}

}
