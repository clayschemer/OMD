package gui.menu;

import gui.Gui;
import gui.StatusArea;
import java.awt.FileDialog;

import model.Storage;
import model.XLBufferedReader;

class OpenMenuItem extends FileMenuItem {
	
	private Storage storage;
	
    public OpenMenuItem(Gui gui, StatusArea statusArea, Storage storage) {
        super(gui, statusArea, "Open");
        action = FileDialog.LOAD;
    }

    public void action(String name) {
        try {
            XLBufferedReader reader = new XLBufferedReader(name, storage);
            System.out.println("1");
            reader.load(storage.map());
            System.out.println("2");
            statusArea.setText("Load Successful");
            System.out.println("3");
        } catch (Exception e) {
        	System.out.println("4 " + e.getMessage());
            statusArea.setText(e.getMessage());
        }
    }
}