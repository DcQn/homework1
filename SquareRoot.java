package be6_complexity_hw5;

public class SquareRoot {

	public static double SquareRoot(int a) {
		double temp;
		double squareroot = a / 2;
	do
	{
		temp = squareroot;
		squareroot = (temp + (a/temp))/2;
	}
	while((temp - squareroot) != 0);
		return squareroot;
	}

	public static void main(String[] args) {
		System.out.println(SquareRoot(10));
	}

}

// Time Complexity: 5;