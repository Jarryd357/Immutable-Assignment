/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starting11;

//import config.playerDetails;

import config.playerDetails;


/**
 *
 * @author user
 */
public class goalKeeper implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private String saveStyle;
    
    private goalKeeper()
    {
        
    }
    
    private goalKeeper(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        saveStyle = builder.saveStyle;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private String saveStyle;
        
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
        
        public Builder saveStyle(String value)
        {
            saveStyle = value;
            return this;
        }
        
        public goalKeeper build()
        {
            return new goalKeeper(this);
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

    public String getSaveStyle() {
        return saveStyle;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }        
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        goalKeeper keeper = (goalKeeper) o;

        if (!playerNumber.equals(keeper.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
    
    
}
