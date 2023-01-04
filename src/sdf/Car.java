package sdf;

public class Car {
    //members
    private String registration;
    private String colour;
    private int year;
    private boolean started;

    //Constructors - the no. of constructors = the no. of ways we can call the obj
    public Car() {
        //default constructor
        this.colour = "white"; //setting default colour is white
    }

    public Car(String colour, String registration) {
        this.colour = colour;
        this.registration = registration;
    }

    //Getters & Setters
    public String getRegistration() {
        return this.registration;
    }
    public void setReigstration(String r) {
        this.registration = r;
    }
    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //Getters for booleans are automatically named with is not get
    public boolean isStarted() {
        return started;
    }

    //All Methods
    public void start(){
        this.started = true;
    }

    public void stop(){
        this.started = false;
    }

    public void getOutOfMyWay(){
        System.out.println("HONK.....");
    }

    //followed by private methods below used internally by class

}