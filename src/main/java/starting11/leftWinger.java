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
public class leftWinger implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private int dribblesCompleted;
    private int chancesCreated;
    
    private leftWinger() 
    {
        
    }
    
    private leftWinger(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        dribblesCompleted = builder.dribblesCompleted;
        chancesCreated = builder.chancesCreated;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private int dribblesCompleted;
        private int chancesCreated;
        
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
        
        public Builder dribblesCompleted(int value)
        {
            dribblesCompleted = value;
            return this;
        }
        
        public Builder chancesCreated(int value)
        {
            chancesCreated = value;
            return this;
        }
            
        public leftWinger build()
        {
            return new leftWinger(this);
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

    public int getDribblesCompleted() {
        return dribblesCompleted;
    }

    public int getChancesCreated() {
        return chancesCreated;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        leftWinger lw = (leftWinger) o;

        if (!playerNumber.equals(lw.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
}
