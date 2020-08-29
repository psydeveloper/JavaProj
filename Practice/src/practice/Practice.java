package practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int marks = 1002;
 	if(marks<35) {
 		System.out.println("fail");
 	}else if(marks >=35 && marks<45) {
 		System.out.println("D Grade");
 		
 	}else if(marks >=45 && marks<60) {
 		System.out.println("C Grade");
 		
 	}else if(marks >=60 && marks<75) {
 		System.out.println("B Grade");
 		
 	}else if(marks >=75 && marks<90) {
 		System.out.println("A Grade");
 		
 	}else if(marks >=90 && marks<100) {
 		System.out.println("Wow Grade");
 		
 	}else {
 		System.out.println("Cheater");
 	}
	}

}
