package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import model.Storage;

public class CurrentView extends JLabel implements Observer {
	
	private Storage storage;
	
    public CurrentView(Storage storage) {
        super(" A1", RIGHT);
        this.storage = storage;
        setBackground(Color.WHITE);
        setOpaque(true);
        storage.addObserver(this);
    }
    
	public void update(Observable o, Object arg) {
		 setText(" " + storage.currentSlot());
	}
}