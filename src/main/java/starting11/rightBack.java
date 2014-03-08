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
public class rightBack implements playerDetails
{
    private String playerNumber;
    private String Name;
    private String Surname;
    private int Age;
    private String playStyle;
    private String styleAttribute;

    private rightBack() 
    {
        
    }
    
    private rightBack(Builder builder)
    {
        playerNumber = builder.playerNumber;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        playStyle = builder.playStyle;
        styleAttribute = builder.styleAttribute;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private String Name;
        private String Surname;
        private int Age;
        private String playStyle;
        private String styleAttribute;
        
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
        
        public Builder playStyle(String value)
        {
            playStyle = value;
            return this;
        }
        
        public Builder styleAttribute(String value)
        {
            styleAttribute = value;
            return this;
        }
        
        public rightBack build()
        {
            return new rightBack(this);
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

    public String getPlayStyle() {
        return playStyle;
    }

    public String getStyleAttribute() {
        return styleAttribute;
    }
    
    public String playerSpecs(String Name, String Surname, int Age)
    {
        return("Name: "+Name+"\nSurname: "+Surname+"\nAge: "+Age);
    } 
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        rightBack rb = (rightBack) o;

        if (!playerNumber.equals(rb.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
    
    
}
