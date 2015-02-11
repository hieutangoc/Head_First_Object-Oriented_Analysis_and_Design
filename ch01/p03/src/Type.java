/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 1
 * Guitar 3
 *
 * keweima @ gmail.com
 *
 */

public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch(this) {
            case ACOUSTIC : return "acoustic";
            case ELECTRIC : return "electric";
            default:        return "none";
        }
    }
}
