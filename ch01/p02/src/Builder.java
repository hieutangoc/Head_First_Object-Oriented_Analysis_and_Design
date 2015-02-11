/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 1
 * Guitar 2
 *
 * keweima @ gmail.com
 *
 */

public enum Builder {

    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS;

    public String toString() {
        switch(this) {
            case FENDER :   return "fender";
            case MARTIN :   return "martin";
            case GIBSON :   return "gibson";
            case COLLINGS : return "collins";
            case RYAN :     return "ryan";
            case PRS :      return "prs";
            default:        return "none";
        }
    }
}
