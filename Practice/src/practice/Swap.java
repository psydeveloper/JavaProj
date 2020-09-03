package practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
int b = 20;
swap(a,b);
	}
public static void swap(int num1, int num2) {
	System.out.println("value before swaping: a: "+num1 + "b: "+num2);
	int c = num1;
	num1 = num2;
	num2 = c;
	System.out.println("values after swaping: a: "+num1 + "b: "+num2);
}
}
