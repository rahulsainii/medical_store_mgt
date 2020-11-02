package useit;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Operations {

    public static void openInternalFrame(JDesktopPane deskpane, JInternalFrame jif) {
        deskpane.add(jif);
        jif.setVisible(true);
    }

    public static void setApplicationIcon(JFrame frm) {
        try {
            ImageIcon image = new ImageIcon(frm.getClass().getResource("/icons/icon.png"));
            frm.setIconImage(image.getImage());
        } catch (Exception ex) {
            ErrorHandler.showErrorStack(ex);
        }
    }
}
