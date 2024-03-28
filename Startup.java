import java.time.LocalDate;

import javax.crypto.spec.ChaCha20ParameterSpec;

/**
 * Startup
 */
public class Startup {


    public static void main(String[] args) {

        // Circle circle = new Circle();
        // circle.radius = 5;
        // System.out.println("Circle 1s radius" + circle.radius);

        // Circle circle2 = circle;
        // System.out.println("Circle 2s radius" + circle2.radius);

        // circle.radius = 10;
        // //System.out.println("Circle 2s radius" + circle2.radius);

        // int radius = 5;
        // System.out.println("radius1" + radius);

        // int radius2 = radius;
        // System.out.println("radius2" + radius2);

        // radius = 76;
        // System.out.println("radius2" + radius2);

        // String name = "Bonnie";
        // String name1 = "Bonnie";

        // System.out.println(name.toUpperCase());

        // Student student = new Student();
        // System.out.println(student);
        // System.out.println(student.name);
        // student.name = "Isabella";
        // System.out.println(student.name);
        // student.GPA = Float.parseFloat("4537.1");
        // System.out.println(student.GPA);

        Student student = new Student();
        student.major = Major.ComputerScience;
        student.name = "Bonnie";
        student.dateOfBirth = LocalDate.of(1988,6,6);
        System.out.println(student);
        System.out.println(student.getAge());

        Student student2 = new Student();
        student2.major = Major.Psychology;
        student2.name = "Rich";
        student.dateOfBirth = LocalDate.of(2014,6,6);
        System.out.println(student2);
        System.out.println(student.getAge());

        if(student.major == Major.ComputerScience){
            System.out.println("Computers are the best!" + student.major.ordinal());
        }

        Car car1 = new Car();
        car1.setHorsePower(14);
        car1.setCarStyle(CarStyle.SUV);
        car1.setPowerType(PowerType.UNLEADED);
        car1.HONK();
        car1.Drive(500);

        Car car2 = new Car(Model.FOUR_RUNNER, Make.TOYOTA, 2020);


        Car car3 = new Car(Model.CRV, Make.HONDA, 2015);
        car3.setHorsePower(195);
  
  
        System.out.println("Number of cars on the road" + Car.numberOfCars);
  
  
        Car car4 = new Car(Model.ACENT, Make.SUBARU, 2021);
        System.out.println("Car 4 name" + car4.carName);
  
  
        System.out.println(car1.getHorsePower());
        System.out.println(car2.getHorsePower());
        System.out.println(car3.getHorsePower());
  
  
  
  

      }
      public static double harmonic(int n){
          int local = 0;
          System.out.println(local);
  
  
          for(int i = 0; i < 3; i++){
              int forLoopLocal = 1;
              System.out.println(forLoopLocal);
          }
          return n;
      }
          public static int countVowels(String input){
              input = input.toLowerCase();
  
  
              int count = 0;
              for(int i = 0; i < input.length(); i++){
                  char ch = input.charAt(i);
                  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                      count++;
                  }
              
              }
              return count;
          }
          // public static int getVowels(String term){
              
          //     for(int i = 0; i < term.length(); i++){
          //         char letter = term.charAt(i);
  
  
          //         if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
  
  
          //         }
          //     }
          // }
          
              
      
      
  }