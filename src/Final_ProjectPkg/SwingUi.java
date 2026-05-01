package Final_ProjectPkg;

import javax.swing.*;
import java.awt.*;

public class SwingUi extends JFrame {
    private ImageFile file;// defaults to null
    Image currentImage;

    // store the img at the class lvl to avoid recreating 60/sec
    public SwingUi(ImageFile file) {
    }

    public SwingUi() {
        setBackground(Color.GRAY);

        // name of the entire window inside wich buttons etc will be
        JFrame frame = new JFrame("Final_ProjectPkg.Main Window");

        frame.setSize(600, 600); // width * height
        frame.setLocation(0,0); // x,y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JPanel Q1 = new JPanel();

        // panel for where buttons will be just starting out
        JPanel Q2 = new JPanel();
        Q2.setBackground(Color.LIGHT_GRAY);
        Q2.add(new JLabel("Top, image below"));
        // not set for image area yet,
        // and dimension need to be set for white to show

        JPanel Q3 = new JPanel();
        JPanel Q4 = new JPanel();

        frame.setBackground(Color.WHITE);
        // white bg

         frame.add(Q1, BorderLayout.NORTH);
         frame.add( Q2, BorderLayout.CENTER);
        // top and center will adjust everything later.
        // border layout
        //https://docs.oracle.com/javase/8/docs/api/index.html?javax%2Fswing%2Fpackage-summary.html=


        //FIXME
        // supposed to render Img, but causes error.
        //frame.setContentPane(new SwingUi(null));
        // if there is no image...^
        frame.setVisible(true);

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

    }

    // currently this panel is showing up only...^^

    //public void mainFrame(){
        //initializes jframe
        //sets borderlayout etc
    //}

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
/*
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
*/
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
