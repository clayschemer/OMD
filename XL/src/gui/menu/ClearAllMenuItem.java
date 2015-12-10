package gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

import model.Storage;

class ClearAllMenuItem extends JMenuItem implements ActionListener {
	
	private Storage storage;
	
    public ClearAllMenuItem(Storage storage) {
        super("Clear all");
        addActionListener(this);
        this.storage = storage;
    }

    public void actionPerformed(ActionEvent e) {
        storage.clearAll();
    }
}
