/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package substitutes7;
import config.subDetails;

/**
 *
 * @author user
 */
public class subAttackMid implements subDetails
{
    private String playerNumber;
    private int subNo;
    private String Name;
    private String Surname;
    private int Age;
    private int Apps;
    private String attackBenefit;
    
    private subAttackMid() 
    {
        
    }
    
    private subAttackMid(Builder builder)
    {
        playerNumber = builder.playerNumber;
        subNo = builder.subNo;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        Apps = builder.Apps;
        attackBenefit = builder.attackBenefit;
    }
    
    public static class Builder
    {
        private String playerNumber;
        private int subNo;
        private String Name;
        private String Surname;
        private int Age;
        private int Apps;
        private String attackBenefit;
        
        public Builder(String playerNumber)
        {
            this.playerNumber = playerNumber;
        }
        
        public Builder subNo(int subNo)
        {
            this.subNo = subNo;
            return this;
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
        
        public Builder Apps(int value)
        {
            Apps = value;
            return this;
        }
        
        public Builder attackBenefit(String value)
        {
            attackBenefit = value;
            return this;
        }
            
        public subAttackMid build()
        {
            return new subAttackMid(this);
        }
        
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public int getSubNo() {
        return subNo;
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

    public int getApps() {
        return Apps;
    }

    public String getAttackBenefit() {
        return attackBenefit;
    }
    
    public String subSpecs(int subNo, String Surname)
    {
        return("Substitute Number: "+subNo+"\nSurname: "+Surname);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        subAttackMid sam = (subAttackMid) o;

        if (!playerNumber.equals(sam.playerNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return playerNumber.hashCode();
    }
}
