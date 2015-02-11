/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 1
 * Guitar 3
 *
 * keweima @ gmail.com
 *
 */

public class GuitarSpec {

    private String model;
    private Builder builder;        // change String to Builder enum
    private double price;
    private Type type;              // change String to Type enum
    private Wood backWood, topWood; // change from String to Wood enum

    public GuitarSpec( Builder builder, String model, Type type,
                        Wood backWood, Wood topWood) {

        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }
    public String getModel() {  return model; }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }
}