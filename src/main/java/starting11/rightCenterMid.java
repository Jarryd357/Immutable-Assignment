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
public class rightCenterMid implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private String midfielderType;
    private String keyAbility;
    
    private rightCenterMid() 
    {
        
    }
    
    private rightCenterMid(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        midfielderType = builder.midFielderType;
        keyAbility = builder.keyAbility;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private String midFielderType;
        private String keyAbility;
        
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
        
        public Builder keyAbility(String value)
        {
            keyAbility = value;
            return this;
        }        
            
        public rightCenterMid build()
        {
            return new rightCenterMid(this);
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

    public String getKeyAbility() {
        return keyAbility;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rightCenterMid rcm = (rightCenterMid) o;

        if (!playerNumber.equals(rcm.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
}
