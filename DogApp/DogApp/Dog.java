public class Dog {

    // instance variables
	String type;
	String breed;
	String name;
	String topTrick;

    // constructor
	public Dog(String dogType, String dogBreed, String dogName)
	{
		type = dogType;
		breed = dogBreed;
		name = dogName;
	
	}

    // methods
	String setTopTrick(String TopTrick)
	{
		topTrick = TopTrick;
		return topTrick;
	}

    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
