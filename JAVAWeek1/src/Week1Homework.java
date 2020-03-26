
public class Week1Homework {

	public static void main(String[] args) {
		
	// Item price	
		
		double itemPrice = 3.67;
		double priceOfAnItem = 249.95;
		
		System.out.println("The price for hand santazier is: " + itemPrice);
		System.out.println("My AppleWatch cost: " + priceOfAnItem);

		
	//Amount of money in wallet

		double moneyInWallet = 37.86;
		double money = 94.95;
		
		System.out.println("My wife has " + moneyInWallet + " In her wallet");
		System.out.println("I wish I had " + money + " In my wallet");
		
	//Number of friends

		int numberOfFriends = 86;
		int friends = 10;
		
		System.out.println("I have accumlated " + numberOfFriends + " Freinds");
		System.out.println("Batman only has " + friends + " Friends" );
	
	//Age in years (as a whole number)
		
		int age = 21;
		char mySistersAge = '6';
		
		System.out.println("Desmond is " + age + " years old");
		System.out.println("My sister is " + mySistersAge + " years old " );
		
	//First name
		
		String firstName = "Jaylynn";
		String trainersFirstName = "Jr";
		
		System.out.println("My wifes first name is " + firstName );
		System.out.println("My trainer's first name is " + trainersFirstName);
		
	//Last Name
		
		String lastName = "Clifford";
		String myLastName = "Young";
		
		System.out.println("My mom's last name is " + lastName);
		System.out.println("My last nmae is " + myLastName);
		
	//Middle initial
		
		char sistersMiddleInitial = 'R';
		char myMiddleInitial = 'A';
		
		System.out.println("Bella's middle intial begins with " + sistersMiddleInitial );
		System.out.println("Desmond's middle intial begins with " + myMiddleInitial );
		
	//New amount of money in wallet after buying the item
		
		double AmountofMoneyInWallet = money - moneyInWallet;
		
		System.out.println("I now have " + AmountofMoneyInWallet + " in my wallet after I went out to eat" );
		
	//Number of friends you’ve made each year based on your age variable and your number of friends variable

		int NumberOfFriendsIveMadeEachYear = age / friends;
		
		System.out.println("I have made " + NumberOfFriendsIveMadeEachYear + " freinds each year based on my age.");
		
	//Full name based on first name, middle initial, and last name
		
		String wifesFirstName = "Jaylynn";
		char middleInitial = 'A';
		String wifesLastName = "Young";
		String fullName = wifesFirstName + " " + middleInitial + " " +  wifesLastName ;
		
		System.out.println(fullName);
		
		

		
		
		
		

	}

}
