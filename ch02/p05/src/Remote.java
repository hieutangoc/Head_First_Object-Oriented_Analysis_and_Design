/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 2
 * Dog Door 1
 *
 * keweima @ gmail.com
 *
 */
public class Remote {

    private DogDoor door;

    public Remote( DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");

        if (door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }

}
