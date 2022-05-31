package ovarb.secondmaven;

public class HelloMaven2 {

	public static void main(String[] args) {
		System.out.println("Hello Maven1!");

		int a = 1;
		int b = 2;
		int c;
		
		Calculator calc = new Calculator();
		c = calc.calcadd(a, b);
		calc.calcprint(c);
		
	}

}
