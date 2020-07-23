/*
 * Modifications made and labeled by Joshua Langer on  6/6/2020
 */

import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor Method modified by Joshua Langer 6/6/2020
    public RescueAnimal() {
    	//Initialized to generic values.
    	name = "No Name";
    	type = "No Type";
    	gender = "None";
    	age = 0;
    	weight = 0.0f;
    	//SDF define aD and sD
    	acquisitionSource = "None";
    	reserved = false;
    	trainingLocation = "None";
    	//SDF define tS and tE
    	trainingStatus = "Out";
    	inServiceCountry = "USA";
    	inServiceCity = "None";
    	inServiceAgency = "None";
    	inServicePOC = "Tom";
    	inServiceEmail = "tom@none.com";
    	inServicePhone = "5555555555";
    	inServicePostalAddress = "555 No Lane";
    }

    // Accessor Methods implemented by Joshua Langer 6/6/2020
    public String getName() {
    	return name;
    }
    
    public String getType() {
    	return type;
    }
    
    public String getGender()
    {
    	return gender;
    }
    
    public Integer getAge() {
    	return age;
    }
    
    public Float getWeight() {
    	return weight;
    }

    public SimpleDateFormat getAcquisitionDate() {
    	return acquisitionDate;
    }
    
    public SimpleDateFormat getStatusDate()
    {
    	return statusDate;
    }
    
    public String getAcquisitionSource()
    {
    	return acquisitionSource;
    }
    
    public Boolean getReserved() {
    	return reserved;
    }
    
    public String getTrainingLocation() {
    	return trainingLocation;
    }
    
    public SimpleDateFormat getTrainingStart() {
    	return trainingStart;
    }
    
    public SimpleDateFormat getTrainingEnd() {
    	return trainingEnd;
    }
    
    public String getTrainingStatus() {
    	return trainingStatus;
    }
    
    public String getInServiceCountry()
    {
    	return inServiceCountry;
    }
    
    public String getInServiceCity()
    {
    	return inServiceCity;
    }
    
    public String getInServiceAgency()
    {
    	return inServiceAgency;
    }
    
    public String getInServicePOC()
    {
    	return inServicePOC;
    }
    
    public String getInServiceEmail()
    {
    	return inServiceEmail;
    }
    
    public String getInServicePhone()
    {
    	return inServicePhone;
    }
    
    public String getInServicePostalAddress()
    {
    	return inServicePostalAddress;
    }
    
    //Mutator Methods implemented by Joshua Langer 6/6/2020
    public void setName(String inputName) {
    	name = inputName;
    }
    
    public void setType(String inputType) {
    	type = inputType;
    }
    
    public void setGender(String inputGender) {
    	gender = inputGender;
    }

    public void setAge(Integer inputAge) {
    	age = inputAge;
    }
    
    public void setWeight(Float inputWeight) {
    	weight = inputWeight;
    }
    
    public void setAcquisitionDate(SimpleDateFormat inputAcqDate) {
    	acquisitionDate = inputAcqDate;
    }
    
    public void setStatusDate(SimpleDateFormat inputStatDate) {
    	statusDate = inputStatDate;
    }
    
    public void setReserved(Boolean inputReserved) {
    	reserved = inputReserved;
    }
    
    public void setTrainingLocation(String inputTrainLoc) {
    	trainingLocation = inputTrainLoc;
    }
    
    public void setTrainingStart(SimpleDateFormat inputTrainStart) {
    	trainingStart = inputTrainStart;
    }
    
    public void setTrainingEnd(SimpleDateFormat inputTrainEnd) {
    	trainingEnd = inputTrainEnd;
    }
    
    public void setTrainingStatus(String inputTrainStatus) {
    	trainingStatus = inputTrainStatus;
    }
    
    public void setInServiceCountry(String inputServiceCountry) {
    	inServiceCountry = inputServiceCountry;
    }
    
    public void setInServiceCity(String inputServiceCity) {
    	inServiceCity = inputServiceCity;
    }
    
    public void setInServiceAgency(String inputServiceAgency) {
    	inServiceAgency = inputServiceAgency;
    }
    
    public void setInServicePOC(String inputServicePOC) {
    	inServicePOC = inputServicePOC;
    }
    
    public void setInServiceEmail(String inputServiceEmail) {
    	inServiceEmail = inputServiceEmail;
    }
    
    public void setInServicePhone(String inputServicePhone) {
    	inServicePhone = inputServicePhone;
    }
    
    public void setInServicePostalAddress(String inputServicePostAddress) {
    	inServicePostalAddress = inputServicePostAddress;
    }
    

}
