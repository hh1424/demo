package edu.guilford;

public class Die {
    
    //Attributes
    private int faceValue;
    private int numSides;


    //Constructors
    public Die() {
        this.numSides = 6;
        this.faceValue = 1;
    }

    //methods
    public void roll() {
        this.faceValue = (int)(Math.random() * this.numSides) + 1;
    }

    public int getValue() {
        return this.faceValue;
    }

    
}
