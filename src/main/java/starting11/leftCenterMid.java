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
public class leftCenterMid implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private String midfielderType;
    private int passesCompleted;
    private int Assists;
    
    private leftCenterMid() 
    {
        
    }
    
    private leftCenterMid(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        midfielderType = builder.midFielderType;
        passesCompleted = builder.passesCompleted;
        Assists = builder.Assists;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private String midFielderType;
        private int passesCompleted;
        private int Assists;
        
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
        
        public Builder midFielderType(String value)
        {
            midFielderType = value;
            return this;
        }
        
        public Builder passesCompleted(int value)
        {
            passesCompleted = value;
            return this;
        }
        
        public Builder Assists(int value)
        {
            Assists = value;
            return this;
        }
            
        public leftCenterMid build()
        {
            return new leftCenterMid(this);
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

    public String getMidfielderType() {
        return midfielderType;
    }

    public int getPassesCompleted() {
        return passesCompleted;
    }

    public int getAssists() {
        return Assists;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        leftCenterMid lcm = (leftCenterMid) o;

        if (!playerNumber.equals(lcm.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
}
