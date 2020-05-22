package com.rk.geh;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class M1_MouseEvent extends Frame implements MouseListener, MouseMotionListener {

    TextField TF;

    public M1_MouseEvent(String Judul) {
        super(Judul);
        TF = new TextField(60);
        addMouseListener(this);
    }

    public void JalankanFrame() {
        add(TF, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String Pesan = "Mouse Dipijit!";
        TF.setText(Pesan);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        String S = "Mouse Dipijit!";
        TF.setText(S);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String X = "Mouse Dirilis";
        TF.setText(X);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String Pesan = "Mouse Masuk Komponen.";
        TF.setText(Pesan);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String Pesan = "Mouse Exited Component";
        TF.setText(Pesan);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String G = "Mouse Dragged at " + e.getX() + "," + e.getY();
        TF.setText(G);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String Pesan = "Mouse dipindahkan pada " + e.getX() + ", " + e.getY();
        TF.setText(Pesan);
    }

    public static void main(String[] args) {
        M1_MouseEvent ME = new M1_MouseEvent("Mouse Event");
        ME.JalankanFrame();
    }
}
