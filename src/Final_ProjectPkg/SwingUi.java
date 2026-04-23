package Final_ProjectPkg;

import javax.swing.*;
import java.awt.*;

public class SwingUi extends JPanel {
    private ImageFile file;// defaults to null
    Image currentImage;

    // store the img at the class lvl to avoid recreating 60/sec
    public SwingUi(ImageFile file) {
        setBackground(Color.GRAY);
    }

    // currently this panel is showing up only...^^

    public void mainFrame(){
        //initializes jframe
        //sets borderlayout etc
    }

    public void setFile(ImageFile newFile){
        this.file = newFile;
        // sets the file in class to the setn file
        if(file != null && file.file != null && !file.file.isEmpty()){
            // get path from ImageFile
            currentImage = new ImageIcon(file.file).getImage();
            System.out.println("Image recieved");
        }

        else{
            currentImage = new ImageIcon(file.defaultPath()).getImage();

            // file set to null to avoid any errors
            System.out.println("Default Image shown");
        }
        repaint();
        // redraw screen / redisplay
    }
// tutorial on yt: "how to put an image on to a Jpanel/JFrame in Java Swing"

    public void paintComponent(Graphics g){
        super.paintComponent(g); // required to clear scerren propeolry

        // check for image. only works if image is not null
        if(file != null){
            // gte current path
            // from awt, paramater is
            // file name as param.
            g.drawImage(currentImage,300,300,44,24, null);
            // x, y, width, height, observer
        }
    }

}

// maybe rename to ui manager

/*
"Final_ProjectPkg.SwingUi" controls things like borders / default borders etc
groups different ui element sections like by frame for faster implementation
makes it easy and fast to update the ui later on
default setups for fast ui building
prob move to html/css for local web ui later

method setupLeftPane
creates jsplitpane for top n bottom adjustable frames
top has import button n small preview
bottom has empty square frame constrained by width equals height binding

method setupHideShowTab
jbutton aligned to far left
toggles left pane visibility on click

method applyPanelBorders
takes jpanel n color as arguments
applies line border to group sections
all borders modify here when darkmode theme changes etc

method setMaxLeftWidth
max width constraint so left half cant be expanded too far etc

method styleEmptySquareFrame
base styling for the bottom left adjustable empty area
*/
