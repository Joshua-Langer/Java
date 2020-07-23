public class Corgi extends Dog {

    // additional instance variables
	int dogWeight;
	int dogAge;

    // constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        dogWeight = pounds;
        dogAge = years;
    }

    // mutator methods
    int setWeight(int weight)
    {
    	dogWeight = weight;
    	return weight;
    }
    
    int setAge(int age)
    {
    	dogAge = age;
    	return age;
    }

    // override toString() method to include additional dog information
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + dogAge +
                " years old and weighs " + dogWeight + " pounds.");
    }

}
