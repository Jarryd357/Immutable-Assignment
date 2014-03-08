/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starting11;
import config.playerDetails;

/**
 *
 * @author user
 */
public class leftBack implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private String matchFitStatus;
    private int numInjuries;
    
    private leftBack() 
    {
        
    }
    
    private leftBack(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        matchFitStatus = builder.matchFitStatus;
        numInjuries = builder.numInjuries;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private String matchFitStatus;
        private int numInjuries;
        
        public Builder(String playerNumber)
        {
            this.playerNumber = playerNumber;
        }
        
        public Builder Name(String value)
        {
            Name = value;
            return this;
        }
        
        public Builder Surname(String value)
        {
            Surname = value;
            return this;
        } 
        
        public Builder Age(int value)
        {
            Age = value;
            return this;
        }
        
        public Builder matchFitStatus(String value)
        {
            matchFitStatus = value;
            return this;
        }
        
        public Builder numInjuries(int value)
        {
            numInjuries = value;
            return this;
        }        
            
        public leftBack build()
        {
            return new leftBack(this);
        }        
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    public String getMatchFitStatus() {
        return matchFitStatus;
    }

    public int getNumInjuries() {
        return numInjuries;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        leftBack lb = (leftBack) o;

        if (!playerNumber.equals(lb.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
    
}
