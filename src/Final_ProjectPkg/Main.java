package Final_ProjectPkg;

import javax.swing.*;

// star imports everything froma  given library, this CAN cause issues in the suture.

public class Main {

    public static void main(String[] args){

        // run it in main
        SwingUtilities.invokeLater(MWindow :: new);

    }
}

//Bry notes, leave until finalized. unnecessary for this proj

/*
note: changes for "future" image gen, keyframeGen, video gen and play support
main entry point for the program
connects swingui n imagefile, child classes (classes passing objects etc)
contains action listener n button logic n try except blocks for invalid files

method main
sets swing look n feel
instantiates swingui n imageclassmain

method handleOpenButton -- pretty sure named import button, more info in one word
action listener attached to import button
triggers jfilechooser
try except block catches invalid files n triggers ui pop ups

method loadMediaToDisplay
takes imagefile object as parameter
casts to display interface
calls render to panel on right side frame

method updateMetadataText
reads from text file using passed object
displays elements in Quad 3
exif / metadat pulled from java.File.IO builtin library

method triggerSurpriseElement-
-- Transparency slider added for all files,
    since i didn't realize the java FileDialog already did more than open a window and do everything

random star roll using 2 lists and radom x,y coords

*/

/*

// test, use later in class, logic etc will prob be moved to html.
//for making the ui in browser based, less compute req
// realy liked that about all the ui's like for printing, or TTS would like to emulate that style / build

seperate theme window:
public static void ChangeTheme(String themeName){
    try{
    if (themeName.equals("dark)){
        UIManager.setLookAndFeel("javaz.swing.platf.metal.MetalLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        //libraries
    }
    catch (Exception e){
        exc.printStackTrace();
    }

 */


