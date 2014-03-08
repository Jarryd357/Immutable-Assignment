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
public class Striker implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private int Goals;
    private int Crackers;
    
    private Striker() 
    {
        
    }
    
    private Striker(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        Goals = builder.Goals;
        Crackers = builder.Crackers;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private int Goals;
        private int Crackers;
        
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
        
        public Builder Goals(int value)
        {
            Goals = value;
            return this;
        }
        
        public Builder Crackers(int value)
        {
            Crackers = value;
            return this;
        }
            
        public Striker build()
        {
            return new Striker(this);
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

    public int getGoals() {
        return Goals;
    }

    public int getCrackers() {
        return Crackers;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Striker st = (Striker) o;

        if (!playerNumber.equals(st.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
}
