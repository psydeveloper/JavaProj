package practice;

public class Moverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int l = 10;
int w = 50;
float r = 2.5f;
int rectangle_area= area(10,50);
float circle_area = area(r);
System.out.println("area of rectangle is:"+ rectangle_area);
System.out.println("area of circle is:"+ circle_area);
	}
public static int area(int n1, int n2) {
	int result = n1*n2;
	return result;
	
}
public static float area(float n) {
	float result = 3.14f*n*n;
			return result;
}
}
