/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 1
 * Guitar 2
 *
 * keweima @ gmail.com
 *
 */

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString() {
        switch(this) {
            case INDIAN_ROSEWOOD :      return "indian_rosewood";
            case BRAZILIAN_ROSEWOOD :   return "brazilian_rosewood";
            case MAHOGANY :             return "mahogany";
            case MAPLE :                return "maple";
            case COCOBOLO :             return "cocobolo";
            case CEDAR :                return "cedar";
            case ADIRONDACK :           return "adirondack";
            case ALDER :                return "alder";
            case SITKA :                return "sitka";
            default:                    return "none";
        }
    }
}
