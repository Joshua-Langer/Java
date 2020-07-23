/*Monkey Class
 * Created by Joshua Langer
 * 6-6-2020
*/
public class Monkey extends RescueAnimal {

	//Instance Variables
	private String species;
	private int tailLength;
	private int height;
	private int bodyLength;
	private int torso;
	private int skull;
	private int neck;
	
	//Constructor
	public Monkey() {
		species = "None";
		tailLength = 0;
		height = 0;
		bodyLength = 0;
		torso = 0;
		skull = 0;
		neck = 0;
	}
	//Accessor
	public String getSpecies() {
		return species;
	}
	
	public Integer getTailLength() {
		return tailLength;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public Integer getBodyLength() {
		return bodyLength;
	}
	
	public Integer getTorso() {
		return torso;
	}
	
	public Integer getSkull() {
		return skull;
	}
	
	public Integer getNeck() {
		return neck;
	}
	
	//Mutator
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	public void setTailLength(Integer inputTailLength) {
		tailLength = inputTailLength;
	}
	
	public void setHeight(Integer inputHeight) {
		height = inputHeight;
	}
	
	public void setBodyLength(Integer inputBodyLength) {
		bodyLength = inputBodyLength;
	}
	
	public void setTorso(Integer inputTorso) {
		torso = inputTorso;
	}
	
	public void setSkull(Integer inputSkull) {
		skull = inputSkull;
	}
	
	public void setNeck(Integer inputNeck) {
		neck = inputNeck;
	}
}
