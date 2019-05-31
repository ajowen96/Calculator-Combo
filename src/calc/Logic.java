package calc;

public class Logic {

	public void numberSet(int first, int second, int third) {
		
		if (first * second == third) {
			System.out.println(first + "*" + second + "=" + third);
			if (third / second == first) {
				System.out.println(third + "/" + second + "=" + first);
				if (third / first == second) {
					System.out.println(third + "/" + first + "=" + second);
				}
			}
		}
		if (first * third == second) {
			System.out.println(first + "*" + third + "=" + second);
			if (second / third == first) {
				System.out.println(second + "/" + third + "=" + first);
				if (second / first == third) {
					System.out.println(second + "/" + first + "=" + third);
				}
			}
		}
		if (second * third == first) {
			System.out.println(second + "*" + third + "=" + first);
			if (first / third == second) {
				System.out.println(first + "/" + third + "=" + second);
				if (first / second == third) {
					System.out.println(first + "/" + second + "=" + third);
				}
			}
		}
		
		
		
		if (first + second == third) {
			System.out.println(first + "+" + second + "=" + third);
			if (third - second == first) {
				System.out.println(third + "-" + second + "=" + first);
				if (third - first == second) {
					System.out.println(third + "-" + first + "=" + second);
				}
			}
		}
		if (first + third == second) {
			System.out.println(first + "+" + third + "=" + second);
			if (second - third == first) {
				System.out.println(second + "-" + third + "=" + first);
				if (second - first == third) {
					System.out.println(second + "-" + first + "=" + third);
				}
			}
		}
		if (second + third == first) {
			System.out.println(second + "+" + third + "=" + first);
			if (first - third == second) {
				System.out.println(first + "-" + third + "=" + second);
				if (first - second == third) {
					System.out.println(first + "-" + second + "=" + third);
				}
			}
		}
	}
}
