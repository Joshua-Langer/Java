/*Driver Class to run the Corgi and Dog classes
 ** Created by Joshua Langer
 ** 5-31-2020
*/


public class Driver {
	
	public static void main(String[] args)
	{
		Dog corgi = new Corgi("cattle herding", "Pembroke Welsh Corgi", "Java", 38, 5); //Instantiate Corgi
		corgi.setTopTrick("ringing the bell to go outside"); //Set the top trick of the corgi.
		System.out.print(corgi.toString()); //send string to console.	
	}
}
