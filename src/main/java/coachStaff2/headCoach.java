/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coachStaff2;

/**
 *
 * @author user
 */
public class headCoach 
{
    private String id;
    private String Name;
    private String Surname;
    private int Age;
    private int yearOfHire;
    private int Trophies;
    
    private headCoach() 
    {
        
    }
    
    private headCoach(Builder builder)
    {
        id = builder.id;
        Name = builder.Name;
        Surname = builder.Surname;
        Age = builder.Age;
        yearOfHire = builder.yearOfHire;
        Trophies = builder.Trophies;
    }
    
    public static class Builder
    {
        private String id;
        private String Name;
        private String Surname;
        private int Age;
        private int yearOfHire;;
        private int Trophies;
        
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
        
        public Builder Trophies(int value)
        {
            Trophies = value;
            return this;
        }
            
        public headCoach build()
        {
            return new headCoach(this);
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

    public int getTrophies() {
        return Trophies;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        headCoach hc = (headCoach) o;

        if (!id.equals(hc.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
