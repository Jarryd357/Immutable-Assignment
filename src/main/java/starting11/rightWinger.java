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
public class rightWinger implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private double distanceCovered;
    
    private rightWinger() 
    {
        
    }
    
    private rightWinger(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        distanceCovered = builder.distanceCovered;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private double distanceCovered;
        
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
        
        public Builder distanceCovered(double value)
        {
            distanceCovered = value;
            return this;
        }
            
        public rightWinger build()
        {
            return new rightWinger(this);
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

    public double getDistanceCovered() {
        return distanceCovered;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rightWinger rw = (rightWinger) o;

        if (!playerNumber.equals(rw.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
}
