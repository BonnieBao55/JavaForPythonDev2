import java.time.LocalDate;
import java.time.Period;

enum Major {ComputerScience, Business, Psychology, Communications};


public class Student {
    String name;
    float GPA;
    boolean isVeteran;
    byte favoriteNumber;
    Major major; //ComputerScience, Business, Psychology, Communications
    LocalDate dateOfBirth;

    public String toString(){
        return name + " " + major;
    }


    public int getAge(){

        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String tosString(String additionalString){
        return name + " " + major + " " + additionalString;

    }


}
