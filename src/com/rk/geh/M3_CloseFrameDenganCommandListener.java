package com.rk.geh;

import sun.plugin2.ipc.windows.WindowsEvent;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class M3_CloseFrameDenganCommandListener extends Frame {
    Label L;
    CFListener W = new CFListener(this);

    M3_CloseFrameDenganCommandListener(String Judul) {
        super(Judul);
        L = new Label("Tutup Frame!");
        this.addWindowFocusListener(W);
    }

    void JalankanFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        M3_CloseFrameDenganCommandListener cfdcl = new M3_CloseFrameDenganCommandListener("Contoh Tutup Jendela");
        cfdcl.JalankanFrame();
    }


}


class CFListener extends WindowAdapter {
    M3_CloseFrameDenganCommandListener CFDCL;

    CFListener(M3_CloseFrameDenganCommandListener CDFCL) {
        this.CFDCL = CFDCL;
    }

    public void TutupJendela(WindowsEvent e) {
        CFDCL.dispose();
        System.exit(1);
    }
}