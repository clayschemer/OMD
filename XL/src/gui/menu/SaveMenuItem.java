package gui.menu;

import gui.Gui;
import gui.StatusArea;
import java.awt.FileDialog;

import model.Storage;
import model.XLPrintStream;

class SaveMenuItem extends FileMenuItem {
	
	private Storage storage;
	
    public SaveMenuItem(Gui gui, StatusArea statusArea, Storage storage) {
        super(gui, statusArea, "Save");
        this.storage = storage;
        action = FileDialog.SAVE;
    }

    public void action(String name) {
        try {
            XLPrintStream printStream = new XLPrintStream(name);
            printStream.save(storage.map().entrySet());
            statusArea.setText("File saved");
        } catch (Exception e) {
            statusArea.setText(e.getMessage());
        }
    }
}