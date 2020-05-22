package com.rk.geh;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class M5_AnonymousInnerClass extends Frame {
    Label label;

    M5_AnonymousInnerClass(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(1);
            }
        });
    }

    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String args[]) {
        M5_AnonymousInnerClass cf = new M5_AnonymousInnerClass("Close Window Example");
        cf.launchFrame();
    }

}
