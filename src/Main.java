public class Main {

    String fileInput;
    // take input, use try except block from Exceptions to chek file. input through this class



}

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
note: renamed to Ui Main or similar later for future video support
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


