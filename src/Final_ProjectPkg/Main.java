package Final_ProjectPkg;

import javax.swing.*;

import java.awt.*;
// star imports everything froma  given library, this CAN cause issues in the suture.

public class Main{

    String fileInput;
    // take input, use try except block from Exceptions to chek file. input through this class
    JpgImg jpg;
    PngImg png;// objects added to allow git push from inteliji.

    static SwingUi imagePanel;
    // for futere theme style changes, can update entire ui faster.

    public static void main(String[] args){
        SwingUi Q1 = new SwingUi();
        SwingUi Q2 = new SwingUi();

        // name of the entire window inside wich buttons etc will be
        JFrame frame = new JFrame("Final_ProjectPkg.Main Window");

        frame.setSize(600, 500); // width * height
        frame.setLocation(0,0); // x,y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.WHITE);
        // white bg

        // FIXME adding a window to a container. ERROR
        // main window logic here ONLY everything else oes SwingUi class
        //frame.add(Q1, BorderLayout.NORTH);
        //frame.add( Q1, BorderLayout.CENTER);
        // top and center will adjust everything later.
        // border layout

        frame.setVisible(true);

        // run it in main
        SwingUtilities.invokeLater(SwingUi :: new);

    }

}

/*
create JFrame/ window
    create jpsplit panes, split screen into 4 and size:
        Q1 left top bottom aprox 100 px wide; locked at about 150, max
        Q3,Q4 bottom aprox 100 px Height
        Q2 main img view right top takes up about 2/3 Space x and y

    border is 3px on ALL parts. maximize space usage in ui.
    bg is dark grey


    Q1 contains 3 tabs from JTabbedPanes
    Q2 contains 2 panes, one for img viewing
    Q3,Q4 currnently empty

    button inside image tabe one
        tab names-> Image, V, Modify



    QUADRANTS for easy understanding:
 Q1-----Q2
 |---|---|
 Q3-----Q4
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
note: changes appld for future video support
main entry point for the program
connects swingui n imagefile, child classes (classes passing objects etc)
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

method triggerSurpriseElement-
--will be sliderfor transparency prob-- png will applies this

*/


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


