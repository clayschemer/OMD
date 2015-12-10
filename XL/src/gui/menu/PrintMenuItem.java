package gui.menu;

import gui.Gui;
import gui.StatusArea;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JMenuItem;
import model.XLException;

class PrintMenuItem extends JMenuItem implements ActionListener {
    private Gui gui;
    private StatusArea statusArea;

    public PrintMenuItem(Gui gui, StatusArea statusArea) {
        super("Print");
        this.gui = gui;
        this.statusArea = statusArea;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(gui);
        // printJob.pageDialog(printJob.defaultPage());
        boolean doPrint = printerJob.printDialog();
        if (doPrint) {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                statusArea.setText(e.getMessage());
            }
        }
    }
}