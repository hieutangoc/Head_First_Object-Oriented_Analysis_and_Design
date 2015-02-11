/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 1
 * Guitar 4
 *
 * keweima @ gmail.com
 *
 */

public class GuitarSpec {

    private String model;
    private Builder builder;
    private double price;
    private Type type;
    private Wood backWood, topWood;
    private int numStrings;

    public GuitarSpec( Builder builder, String model, Type type,
                        Wood backWood, Wood topWood, int numStrings) {

        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
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
    public int getNumStrings() { return numStrings; }

    public boolean matches(GuitarSpec otherspec) {

        if ((builder != otherspec.getBuilder()) ||
            (type != otherspec.getType()) ||
            (backWood != otherspec.getBackWood()) ||
            (topWood != otherspec.getTopWood()) ||
            (numStrings != otherspec.getNumStrings()))
            return false;

        if ((model.toLowerCase() != null) && (model.toLowerCase().equals("")) &&
            (!model.toLowerCase().equals(otherspec.getModel().toLowerCase())))
            return false;

        return true;
    }
}