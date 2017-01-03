package imageviewer;

import imageviewer.ui.swing.SwingImageDisplay;
import java.awt.Component;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

    public MainFrame() {
        this.setTitle("Image Viewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(image());
        this.add(toolbar());
        this.setVisible(true);
    }

    private Component image() {
        return new SwingImageDisplay();
    }

    private Component toolbar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
