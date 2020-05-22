package com.rk.geh;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class M4_CloseFrameDenganInnerClass extends Frame {
    Label label;

    M4_CloseFrameDenganInnerClass(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(new CFListener());
    }

    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    class CFListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        M4_CloseFrameDenganInnerClass cf = new M4_CloseFrameDenganInnerClass("Close Window Example");
        cf.launchFrame();
    }
}
