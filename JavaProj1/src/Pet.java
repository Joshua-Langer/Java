/*
 * Summary *
 * Class written by: Joshua Langer 
 * May 2020
 * 
 * This Class will utilize pet variables to allow modification of the pet and if they are entering or leaving the facility.
 */
public class Pet {

	//Internal Fields
	static String petType;
	static String petName;
	static int petAge;
	static int catSpace;
	static int dogSpace;
	static int daysStay;
	static double amountDue;
	
	//Contructor
	public Pet()
	{
		petType = "No Type";
		petName = "NoName";
		petAge = -1;
		catSpace = -1;
		dogSpace = -1;
		daysStay = -1;
		amountDue = -1.0;
	}
	
	
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
	
	public static void setDogSpaceNbr(int space)
	{
		dogSpace = space;
	}
	
	public static void setAmountDue(double customerDue)
	{
		double petTypeAmount = 0.0;
		if(petType == "Cat")
		{
			petTypeAmount = 18.00;
		}
		else
		{
			petTypeAmount = 36.00; //Will need to be set based on weight class of the dog.
		}
		customerDue = daysStay * petTypeAmount; // Calculate this and save into customerDue and apply customerDue to amountDue.
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
	
	public static int getDogSpaceNbr()
	{
		return dogSpace;
	}
	
	public static double getAmountDue()
	{
		return amountDue;
	}
	/*End Accessors*/
	
	
}
