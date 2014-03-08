/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coachStaff2;

/**
 *
 * @author user
 */
public class assistantCoach 
{
    private String id;
    private String Name;
    private String Surname;
    private int Age;
    private int yearOfHire;
    private String prevClub;
    
    private assistantCoach() 
    {
        
    }
    
    private assistantCoach(Builder builder)
    {
        id = builder.id;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        yearOfHire = builder.yearOfHire;
        prevClub = builder.prevClub;
    }
    
    public static class Builder
    {
        private String id;
        private String Name;
        private String Surname;
        private int Age;
        private int yearOfHire;;
        private String prevClub;
        
        public Builder(String id)
        {
            this.id = id;
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
        
        public Builder yearOfHire(int value)
        {
            yearOfHire = value;
            return this;
        }
        
        public Builder prevClub(String value)
        {
            prevClub = value;
            return this;
        }
            
        public assistantCoach build()
        {
            return new assistantCoach(this);
        }
        
    }

    public String getId() {
        return id;
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

    public int getYearOfHire() {
        return yearOfHire;
    }

    public String getPrevClub() {
        return prevClub;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        assistantCoach ac = (assistantCoach) o;

        if (!id.equals(ac.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
