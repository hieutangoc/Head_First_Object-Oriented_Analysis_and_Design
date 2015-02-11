/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 1
 * Guitar 3
 *
 * keweima @ gmail.com
 *
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar( String serialNumber,
                           double price,
                           Builder builder,
                           String model,
                           Type type,
                           Wood backWood,
                           Wood topWood) {

        Guitar guitar = new Guitar( serialNumber, price, builder,
                                    model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar( String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }

        // nothing found
        return null;
    }

    public List search( GuitarSpec searchGuitar) {

        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getSpec();

            if ((searchGuitar.getBuilder() != guitarSpec.getBuilder()) ||
                (searchGuitar.getType() != guitarSpec.getType()) ||
                (searchGuitar.getBackWood() != guitarSpec.getBackWood()) ||
                (searchGuitar.getTopWood() != guitarSpec.getTopWood()))
                continue;

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("") &&
                (!model.equals(guitarSpec.getModel().toLowerCase()))))
                continue;

            matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }

}