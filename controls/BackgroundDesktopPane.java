package controls;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import useit.ErrorHandler;

public class BackgroundDesktopPane extends JDesktopPane {

    private Image backimage;

    public BackgroundDesktopPane() {
       try {
            ImageIcon image = new ImageIcon(getClass().getResource("/icons/background.jpg"));
            this.backimage = image.getImage();
        } catch (Exception ex) {
            ErrorHandler.showErrorStack(ex);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(backimage!=null){
            g.drawImage(backimage, 0, 0, getWidth(), getHeight(), this);
        }else{
            super.paintComponent(g);
        }
    }
    
    
    
}
