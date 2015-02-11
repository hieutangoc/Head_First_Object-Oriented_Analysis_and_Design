/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 2
 * Dog Door 3
 *
 * keweima @ gmail.com
 *
 */
public class DogDoor {

    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        this.open = true;
    }

    public void close() {
        System.out.println("The doog door closes.");
        this.open = false;
    }

    public boolean isOpen() {
        return this.open;
    }
}
