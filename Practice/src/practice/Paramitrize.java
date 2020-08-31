package practice;

public class Paramitrize {

	public static void main(String[] args) {
		// 3 exampls
//sparta();
       //or
		//add(5,10);
		//or
		Paramitrize obj = new Paramitrize();
		int x = 10;
		int y = 30;
				int get_result=obj.add(x,y); 
				
			System.out.println(get_result);
		}
	//  Non Paramiterized
	//public static void sparta() {
	
	//System.out.println("this is sparta");
	              //or
	
	//public static void add(int num1, int num2) {
		//System.out.println(num1+num2);
	          //or
	public int add(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
}


