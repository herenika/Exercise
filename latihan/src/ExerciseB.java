import java.util.Scanner;

public class ExerciseB {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Exercise2();
		Exercise6();
		Exercise7();
		Exercise11();
		Exercise13();
		Exercise34();
		Exercise35();
		Exercise55();
	    Exercise62();
		Exercise65();
		
	}
	
	public static void Exercise2() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstnum = in.nextInt();
		System.out.print("Enter the second number: ");
		int secondnum = in.nextInt();
		int sum = firstnum + secondnum;
		System.out.println("the sum of the two number is: "+ sum);
	}

	public static void Exercise6() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1 +num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1 & num2));
	}
	
	public static void Exercise7( ) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = in.nextInt();
				for (int i=0; i<10; i++){
					System.out.println(num1 + " x " + (i + i) + " = " + (num1 * (i+i)));
				}

	}
	
	public static void Exercise11( ) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = in.nextDouble();
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		System.out.printf("Perimeter is = %8.2f%n", perimeter);
		System.out.printf("Area is = %14.2f%n",area );
		
	}
	
	public static void Exercise13() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the width: ");
		double width = in.nextDouble();
		System.out.print("Enter the height");
		double height = in.nextDouble();
		double Perimeter = 2 *(height + width);
		double Area = height * width;
		System.out.printf("Perimeter of rectangle is: %4.2f%n" , Perimeter);
		System.out.printf("Area of rectangle is: %9.2f%n", Area);
		
	}
	

	public static void Exercise34() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the length side of hexagon: ");
		double length = in.nextDouble();
		double hexagonArea = (6* (length * length))/( 4 * Math.tan (Math.PI/6)); 
		System.out.printf("The area of the hexagon is: %8.2f%n", hexagonArea);
		
	
	}
	
	public static void Exercise35() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of the side: ");
		int n = in.nextInt();
		System.out.print("Enter the length of the side: ");
		double s = in.nextDouble();
		double polygonArea = (n *(s *s) /(4 * Math.tan(Math.PI/n)));
		System.out.printf("The area of polygon is: %6.2f%n", polygonArea);
	
		
	}
	
		public static void Exercise55() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter seconds: ");
		int seconds = in.nextInt();
		int sec = seconds % 60;
		int hour = seconds/ 60;
		int min = hour % 60;
		hour = hour/60;
		System.out.println(hour + ":" + min+":" + sec+":");
		
	}
		
		public static void Exercise62() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter first number: ");
			int x = in.nextInt();
			System.out.print("Enter second number: ");
			int y = in.nextInt();
			System.out.print("Enter third number: ");
			int z = in.nextInt();
			System.out.println((Math.abs(x-y) >=20) || (Math.abs(y-z)>=20)|| (Math.abs(z-x) >=20));
		}
		
		public static void Exercise65() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter the first number: ");
			int a = in.nextInt();
			System.out.print("Enter the second number: ");
			int b = in.nextInt();
			int divided = a / b;
			int result = a - (divided * b );
			System.out.println(result);
		}
}
	
