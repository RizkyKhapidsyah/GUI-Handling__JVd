package com.rk.geh;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class M2_CloseFrame extends Frame implements WindowListener {

    Label L;

    M2_CloseFrame(String title) {
        super(title);
        L = new Label("Tutup Frame");
        this.addWindowListener(this);
    }

    void JalankanFrame() {
        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        M2_CloseFrame CF=new M2_CloseFrame("Contoh Tutup Jendela");
        CF.JalankanFrame();
    }
}
