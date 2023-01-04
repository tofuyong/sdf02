package sdf;

public class CarMain {
    //entry point
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setReigstration("AYLR89");
        myCar.start();
        System.out.printf("Has myCar started? %b\n", myCar.isStarted());
        myCar.getOutOfMyWay();

        Car jxCar = new Car();
        jxCar.setColour("orange");
        myCar.setReigstration("LJX88");
        myCar.start();
        System.out.printf("What is the colour of jxCar? %s\n", jxCar.getColour());

        Car papaCar = new Car("black", "YKK2630");
        System.out.printf("What is the colour of papaCar? %s\n", papaCar.getColour());
        System.out.printf("What is the registration of papaCar? %s\n", papaCar.getRegistration());
        
        Porche p = new Porche();
        System.out.printf("Colour of porche? %s\n", p.getColour());
        p.setColour("pink");
        System.out.printf("Colour of porche? %s\n", p.getColour());
    }

    
}
