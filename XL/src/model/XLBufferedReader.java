package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import model.XLException;
import model.Address;

//TODO move to another package
public class XLBufferedReader extends BufferedReader {
	
	private Storage storage;
	
    public XLBufferedReader(String name, Storage storage) throws FileNotFoundException {
        super(new FileReader(name));
        System.out.println("ghkl");
    }

    //TODO Change Object to something appropriate
    public void load(Map<Address, Slot> map) {
    	SlotFactory factory = new SlotFactory(storage);
        try {
        	if (ready()) {
        		System.out.println("ajam redi");
        	} else {
        		System.out.println("ajam nut redi");
        	}
            while (ready()) {
                String string = readLine();
                System.out.println(string);
                int i = string.indexOf('=');
                storage.add(string.substring(0,i-1), string.substring(0,i+1));
                map.put(new Address(string.substring(0,i-1)), factory.slotBuilder(string.substring(0,i+1)));
            }
        } catch (Exception e) {
            throw new XLException(e.getMessage());
        }
    }
}
