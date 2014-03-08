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
public class centerMid implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private String midfielderType;
    private int tacklesCompleted;
    private int Interceptions;
    
    private centerMid() 
    {
        
    }
    
    private centerMid(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        midfielderType = builder.midFielderType;
        tacklesCompleted = builder.tacklesCompleted;
        Interceptions = builder.Interceptions;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private String midFielderType;
        private int tacklesCompleted;
        private int Interceptions;
        
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
        
        public Builder tacklesCompleted(int value)
        {
            tacklesCompleted = value;
            return this;
        }
        
        public Builder Interceptions(int value)
        {
            Interceptions = value;
            return this;
        }
            
        public centerMid build()
        {
            return new centerMid(this);
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

    public int getTacklesCompleted() {
        return tacklesCompleted;
    }

    public int getInterceptions() {
        return Interceptions;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        centerMid cm = (centerMid) o;

        if (!playerNumber.equals(cm.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
}
