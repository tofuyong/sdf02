package sdf;

public class CarMain2 {
    public static void main(String[] args) {
        Porche p;

        Car c = new Porche("yellow", "s1234z");
        
        System.out.printf(">>>>> c.registration: %s, %s\n"
                        , c.getRegistration(), c.getColour());

        p = (Porche)c; //casting; make c into a porche and assign it to p
        p.accelerate(); //casting allows p 
        System.out.printf(">>>>> p.registration: %s, %s\n", p.getRegistration(), p.getColour());

        //This code does not flag up error at compile but only run time
        c = new Car();
        if (c instanceof Porche){
            System.out.println("You have a Porche");
            p = (Porche)c;
            p.accelerate();
        } else {
            System.out.println("Your car is not a Porche");
        }
         
    }
}
