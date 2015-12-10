package model;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Set;
import java.util.Map.Entry;

import model.Address;


public class XLPrintStream extends PrintStream {
    public XLPrintStream(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public void save(Set<Entry<Address, Slot>> entrySet) {
        for (Entry<Address, Slot> entry : entrySet) {
        	System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
            print(entry.getKey());
            print('=');
            println(entry.getValue());
        }
        flush();
        close();
    }
}
