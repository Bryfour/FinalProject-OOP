package Final_ProjectPkg;

import javax.swing.*;
import java.awt.*;

public class SwingUi extends JPanel {
    private ImageFile file;// defaults to null
    Image currentImage;

    // store the img at the class lvl to avoid recreating 60/sec
    public SwingUi(ImageFile file) {
    }

    public SwingUi() {
        setLayout(new BorderLayout());

        JPanel Q1 = new JPanel(new BorderLayout());
        Q1.setBackground(Color.RED);
        Q1.add(new JLabel(("QUADRANT 1;" + "\n LEFT SIDE W IMG TOOLS N BUTTONS?")));

        //set up sizing
        //Q1.setMinimumSize(new Dimension(100,0));

        JPanel Q2 = new JPanel(new BorderLayout());
        Q2.setBackground(Color.GREEN);
        Q2.add(new JLabel("QUADRANT 2; IMAGE GOES HERE"));

        JPanel Q3 = new JPanel(new BorderLayout());
        Q3.setBackground(Color.BLACK);
        Q3.add(new JLabel("QUADRANT 3; STUFF"));

        JPanel Q4 = new JPanel(new BorderLayout());
        Q4.setBackground(Color.CYAN);
        Q4.add(new JLabel("QUADRANT 4; " + "\n I GUESS Error Stuff"));


        // split the quadrants up like the way i want to make them look
        // more like order, Q1, Q2
        JSplitPane topQ = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, Q1, Q2);
        JSplitPane bottomQ = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, Q3, Q4);

        //FIXME trying to make the H and V splits to line up. think i will use percentage for sizing ere
        //leftPanes = Q1,Q3;
        //rightPanes = Q2,Q4;
        // combine 4 quads together w vertical split
        JSplitPane leftRQuads = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topQ, bottomQ);
        // use add w/o window onject bc it will just be glued on

        // add everything to win hree
        add(leftRQuads, BorderLayout.CENTER);


        // panel for where buttons will be just starting out
        //JPanel Q2 = new JPanel();
        //Q2.setBackground(Color.LIGHT_GRAY);
        // not set for image area yet,
        // and dimension need to be set for white to show

        //JPanel Q3 = new JPanel();
        //JPanel Q4 = new JPanel();
        //JSplitPane quad = new JSplitPane();
        // split into quad

        //setBackground(Color.GRAY);

        //https://docs.oracle.com/javase/8/docs/api/index.html?javax%2Fswing%2Fpackage-summary.html=
    }
}

//FIXME Margins are too Fat,
    // 25% Left side and 20% bottom margins fine, right top, Q2) is main image viewing
    // prob about 150 and 200px minimum

        //FIXME
        // supposed to render Img, but causes error.
        // "Adding a window to a container"
        //frame.setContentPane(new SwingUi(null));
        // if there is no image...^

        // just call the swing ui object with .setFile(selectedFile);
        // obviousily once this get inplemented.

        // file dialog
        //https://docs.oracle.com/javase/8/docs/api/java/awt/FileDialog.html

        // button for import/ open file
        //https://docs.oracle.com/javase/8/docs/api/index.html?javax%2Fswing%2Fpackage-summary.html=

        // img class that allows for any image upscaling etc
        //https://docs.oracle.com/javase/8/docs/api/java/awt/Image.html

        // left pane (JTabbedPane)
        //https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/ImageCapabilities.html



    // currently this panel is showing up only...^^

    //FIXME
    // Image rendering here, tutorial was for icon, may just get delted.
    /*
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
        //super.paintComponent(g); // required to clear scerren propeolry
        ImageIcon image = new ImageIcon();

        // check for image. only works if image is not null
        if(file != null){
            // gte current path
            // from awt, paramater is
            // file name as param.
            g.drawImage(currentImage,300,300,44,24, null);
            // x, y, width, height, observer
        }
    }
    */


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
