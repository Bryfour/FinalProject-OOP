package Final_ProjectPkg;

import javax.swing.*;
import java.awt.*;
// star imports everything froma  given library, this CAN cause issues in the suture.

public class Main {

    String fileInput;
    // take input, use try except block from Exceptions to chek file. input through this class
    JpgImg jpg;
    PngImg png;// objects added to allow git push from inteliji.

    static JFrame frame;
    static SwingUi imagePanel;
    // for futere theme style changes, can update entire ui faster.

    public static void main(String[] args){

        // name of the entire window inside wich buttons etc will be
        JFrame frame = new JFrame("Final_ProjectPkg.Main Window");

        frame.setSize(600, 600); // width * height
        frame.setLocation(0,0); // x,y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        // panel for where buttons will be just starting out
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.add(new JLabel("Top, image below"));
        // not set for image area yet,
        // and dimension need to be set for white to show

        imagePanel = new SwingUi(null);
        imagePanel.setBackground(Color.WHITE);
        // white bg

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(imagePanel, BorderLayout.CENTER);
        // top and center will adjust everything later.

        frame.setContentPane(new SwingUi(null));
        // if there is no image...^
        frame.setVisible(true);

        // just call the swing ui object with .setFile(selectedFile);
        // obviousily once this get inplemented.

    }

}

/*
seperate theme window:
public static void ChangeTheme(String themeName){
    try{
    if (themeName.equals("dark)){
        UIManager.setLookAndFeel("javaz.swing.platf.metal.MetalLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        //libraries
    }
    catch (Exception exc){
        exc.printStackTrace();
    }

 */

/*

must have requirements:
Obviousily java
Polymorphism
Inheritance
Abstract class
Interface
Constructor
Exceptions

Use JavaSwing or Java Fx-- USE JAVA FX
Contain an action listner + Button
Text display
Reading from a text file and displaying elements from it
Labels and UI pop ups
Should be an interactable UI
A surprise element that uses any feature from JavaSwing or JavaFx
Classes that pass other classes as objects among each other in a multifile environment
Ability to read or write to a file.
 */

/*
note: renamed to Ui Final_ProjectPkg.Main or similar later for future video support
main entry point for the program
connects swingui n imagefile child classes (classes passing objects etc)
contains action listener n button logic n try except blocks for invalid files
method main
sets swing look n feel
instantiates swingui n imageclassmain
method handleOpenButton
action listener attached to import button
triggers jfilechooser
try except block catches invalid files n triggers ui pop ups
method loadMediaToDisplay
takes imagefile object as parameter
casts to display interface
calls render to panel on right side frame
method updateMetadataText
reads from text file using passed object
displays elements from it in the left frame text area
method triggerSurpriseElement
uses a random swing feature
maybe custom draggable ghost image or animated cursor when hovering main display etc
*/


