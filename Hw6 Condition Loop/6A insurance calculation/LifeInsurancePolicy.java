
/**
 * get identity and crimeArea of a person then calculate the premiums of
 * this person and return it.
 *
 * @author: Sharon Le
 * @version: 3/6/2021
 */
public class LifeInsurancePolicy
{
    // instance variables - replace the example below with your own
    private boolean crimeArea;
    private Person identidy;
    /**
     * Constructor for objects of class LifeInsurancePolicy
     * 
     * @param who takes the person identity
     * @param status detects if person live in a high crime area or not
     */
    public LifeInsurancePolicy(Person who, boolean status)
    {
        // initialise instance variables
        identidy = who;
        crimeArea = status;
    }

    /**
     * get the age of this person from Person class and return it
     * 
     * @return age of this person
     */
    public int policyHolderAge()
    {
        return identidy.getAge();
    }
    
    /**
     * get gender of this person from Class Person and return it
     * 
     * @return this person gender
     */
    public String policyHolderGender()
    {
        String gender = "" + identidy.getGender();
        return gender;
    }
    
    /**
     * increases this person age of this insured person
     * 
     */
    public void incrementAge()
    {
        identidy.birthday();
    }
    
    /**
     * calculates the premium of this insured person
     * 
     * @return premium amount of this person
     */
    public double premium()
    {
        int age = this.policyHolderAge();
        String gender = this.policyHolderGender();
        double priceM1 = 20.0, priceM2 = 50.0, priceM3 = 110.0;
        double priceF1 = 18.50, priceF2 = 45.0, priceF3 = 100.0;
        int lowRange = 21;
        int midRange = 60;
        int highRange = 80;
        double premiums = 0;
        double surcharge = 0.1;
        if (gender.equals("m") && age < lowRange)
        {
            premiums = priceM1 * age;
            
        }
        else if (gender.equals("m") && age < midRange)
        {
            premiums = priceM2 * age;
            
        }
        else if (gender.equals("m") && age < highRange)
        {
            premiums = priceM3 * age;
            
        }
        else if (gender.equals("f") && age < lowRange)
        {
            premiums = priceF1 * age;
            
        }
        else if (gender.equals("f") && age < midRange)
        {
            premiums = priceF2 * age;
            
        }
        else if (gender.equals("f") && age < highRange)
        {
            premiums = priceF3 * age;
            
        }
        if (crimeArea == true)
        {
            premiums = premiums + (premiums * surcharge);
        }
        if (age >= highRange)
        {
            premiums = -1;
        }
        
        return premiums;
    }
    
    
}
