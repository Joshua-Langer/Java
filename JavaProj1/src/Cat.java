import java.util.Scanner;

public class Cat     //Info about the Cat
{
	//Internal fields
	
	static String petType;   //Cat or Dog
	static String petName;   //Pet Name
	static int petAge; 	  //How old is the Pet
	static int catSpace; 	  //Space Number for the Cat
	static int daysStay; 	  //How long will the pet be cared for.
	static double amountDue; //How much does the customer owe.
	
	/*Mutators*/
	public static void setPetType(String type)
	{
		petType = type;
	}
	
	public static void setPetName(String name)
	{
		petName = name;
	}
	
	public static void setPetAge(int age)
	{
		petAge = age;
	}
	
	public static void setDaysPetStay(int stayLength)
	{
		daysStay = stayLength;
	}
	
	public static void setCatSpaceNbr(int space)
	{
		catSpace = space;
	}
	
	public static void setAmountDue(double customerDue)
	{
		customerDue = daysStay * 18.00; //Cats are $18.00 per day. Calculate this and save into customerDue and apply customerDue to amountDue.
		amountDue = customerDue;
	}
	/*End Mutators */
	
	/*Accessors*/
	public static String getPetType()
	{
		return petType;
	}
	
	public static String getPetName()
	{
		return petName;
	}
	
	public static int getPetAge()
	{
		return petAge;
	}
	
	public static int getCatSpaceNbr()
	{				
		return catSpace;
	}
	
	public static double getAmountDue()
	{
		return amountDue;
	}
	/*End Accessors*/
	
	//function to set console prints
	public static void print()
	{
		System.out.println("Pet Type: " + petType);
		System.out.println("Pet Name: " + petName);
		System.out.println("Pet Age: " + petAge);
		System.out.println("Cat Space: "+ catSpace);
		System.out.printf("%.2f \f", getAmountDue());
	}
	
	//primary method to allow input and access the setters.
	public static void main(String[] args)
	{
		//Main variables to input into Mutators
		String petTypeInfo;
		String petNameInfo;
		int petAgeNbr;
		int catSpaceNum;
		int daysStayNum;
		
		//Initialize the Scanner
		Scanner scnr = new Scanner(System.in);
		
		//Capture Input and set to the proper Mutator
		System.out.println("Enter the Pet Type: ");
		petTypeInfo = scnr.next();
		setPetType(petTypeInfo);
		System.out.println("Enter the Pet Name: ");
		petNameInfo = scnr.next();
		setPetName(petNameInfo);
		System.out.println("Enter the Pet's Age: ");
		petAgeNbr = scnr.nextInt();
		setPetAge(petAgeNbr);
		System.out.println("Enter the Cat's Space Number");
		catSpaceNum = scnr.nextInt();
		setCatSpaceNbr(catSpaceNum);
		System.out.println("Enter the length of stay: ");
		daysStayNum = scnr.nextInt();
		setDaysPetStay(daysStayNum);
		setAmountDue(0);
		
		print();
		
		
		
		
		
	}
	
	
}
