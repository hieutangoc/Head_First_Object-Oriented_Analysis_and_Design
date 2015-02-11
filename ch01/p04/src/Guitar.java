/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 1
 * Guitar 4
 *
 * keweima @ gmail.com
 *
 */

public class Guitar {

    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar( String serialNumber, double price,
                   GuitarSpec spec) {

        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber(){
        return serialNumber;
    }
    public double getPrice() { return price; }
    public void setPrice( float newPrice) {
        this.price = newPrice;
    }
    public GuitarSpec getSpec() { return spec; }
}