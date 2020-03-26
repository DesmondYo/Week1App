
public class Application {

	public static void main(String[] args) {
		
		//operator performs actions on operands
		// +, -, *, / = These are operators in Java
		
		
		int age = 20 * 2;
		System.out.println(age);
		boolean isMyAge30 = age == 30;
		System.out.println(isMyAge30);
		
		System.out.println(age == 40);
		
		age = age + 1;
		System.out.println(age);
		
		String firstName = "Christy";
		String lastName = "Clifford";
		String fullName = firstName + " " + lastName; //concatenation
		System.out.println(fullName);
	}
	
}
