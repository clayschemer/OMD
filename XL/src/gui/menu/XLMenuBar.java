package gui.menu;

import gui.Gui;
import gui.GuiList;
import gui.StatusArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import model.Storage;

public class XLMenuBar extends JMenuBar {
    public XLMenuBar(Gui gui, GuiList guiList, StatusArea statusArea, Storage storage) {
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        file.add(new PrintMenuItem(gui, statusArea));
        file.add(new SaveMenuItem(gui, statusArea, storage));
        file.add(new OpenMenuItem(gui, statusArea, storage));
        file.add(new NewMenuItem(gui));
        file.add(new CloseMenuItem(gui, guiList));
        edit.add(new ClearMenuItem(storage));
        edit.add(new ClearAllMenuItem(storage));
        add(file);
        add(edit);
        add(new WindowMenu(guiList));
    }
}