package sdf;

public class Porche extends Car {

    private String turbo;
    private int accelerate = 0;

    public Porche() {
        super.setColour("red");
    }

    public Porche(String colour, String registration) {
        super.setColour(colour); //if colour attribute is changed to protected in parent class, can access using this.colour
        setReigstration(registration);
        //cannot write as this as this/object is private, can only use in Car.java
    }

    //Porche specific methods
    public String getTurbo() {
        return turbo;
    }

    //An empty method overrides the parent method, disallowing anyone from changing the colour
    //This could be a business requirement
    //I can no longer change the colour of the car once it has been instantiated
    @Override
    public void setColour(String c){

    }

    public void accelerate() {
        this.accelerate++;
        if (this.accelerate > 4) {
            this.turbo = "on";
        }
    }

    public void decelerate() {
        this.accelerate--;
        if (this.accelerate <= 4){
            this.turbo = "off";
        }
    }
    
}
