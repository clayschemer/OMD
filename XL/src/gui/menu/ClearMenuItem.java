package gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import model.Storage;

class ClearMenuItem extends JMenuItem implements ActionListener {
	
	private Storage storage;
	
    public ClearMenuItem(Storage storage) {
        super("Clear");
        addActionListener(this);
        this.storage = storage;
    }

    public void actionPerformed(ActionEvent event) {
        storage.clearCurrent();
    }
}