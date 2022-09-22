package practice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 3;
		System.out.println(addNumbers(x, y));
		
		int sum = addNumbers(x, y) * addNumbers(x, y);
		System.out.println(sum);
	}

	
	public static int addNumbers(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}
}
