/**
 * Startup
 */
public class Startup {


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1s radius" + circle.radius);

        Circle circle2 = circle;
        System.out.println("Circle 2s radius" + circle2.radius);

        circle.radius = 10;
        //System.out.println("Circle 2s radius" + circle2.radius);

        int radius = 5;
        System.out.println("radius1" + radius);

        int radius2 = radius;
        System.out.println("radius2" + radius2);

        radius = 76;
        System.out.println("radius2" + radius2);

        String name = "Bonnie";
        String name1 = "Bonnie";

        System.out.println(name.toUpperCase());

        Student student = new Student();
        System.out.println(student);
        System.out.println(student.name);
        student.name = "Isabella";
        System.out.println(student.name);
        student.GPA = Float.parseFloat("4537.1");
        System.out.println(student.GPA);


    }

    public static double harmonic(int n) {
        int local = 0;
        System.out.println(local);

        return n;
        
    }


public static int getVowels(String term) {
    String lowerCased = term.toLowerCase();
    int counter = 0;
    for (int i = 0; i < term.length();i++){
        char letter = lowerCased.charAt(i);
    
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter =='u') {
            counter++;
        } 
    }
    return counter;
}
}

    

