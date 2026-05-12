package Final_ProjectPkg;

import javax.swing.*;
import java.awt.*;

// libs for metadata/ disp of img (BUILT IN TO JAVA)
import javax.imageio.ImageIO;
// read with this. tools kind of for working w the img
import javax.imageio.ImageReader;
// reads/ provides image metadata specifics
import javax.imageio.stream.ImageInputStream;
// interface fr the raw img reading

// how to load an image in java this will work with the pane
// https://www.youtube.com/watch?v=gp9H0WLxKgU

// maybe in the future even read exif data.
// for something like determining focal length etc to do math on an image, say for computer vidosn

public abstract class ImageFile implements Display{
//import java.util.

    private String file;
    private JLabel[] labelArray;
/*
    // add meta data labels etc vars for that because why not
    private String fileName;
    private String pixAmount;
    private String dimensionX,dimensionY;
    private String size;// size as in kb, mb, or... if its a thing gb
    private String created; // date, time etc. include logic that checks and does/not displ if some not found
    // data, time etc.
*/




    //FIXME WARNING this is mainly for bry bry
    // probably a good place to put try except blocks.
    // for data that can't be pulled from the img

    public void dispMetaData(int dataPoints){
        // meta data is basic information about an img /  video or file,
            //contains creation, access dates and times, path etc

        for(int i = 0; i >= dataPoints;){
            // create a jbale for each data point, assuming that there may be missing info.
            // ok, actually create an array that if full throws exception,
            // and it gets cauthg.
            // labelArray is the list
            //labelArray.add(dataPoints + i);
            System.out.println(i + " label Number " + " datapint: " + dataPoints);

        }

    }

    public ImageFile(String file){
        this.file = file;
        // takes file input and stores it... for now the file path will be a string
        // current file

    }

    //FIXME with the new libraries for metadata,
    // this might be totally irevalant soon.
    // if needed,
    public String getFilePath(){
        return file;
    }
    public void setFilePath(String path){
        file = path;
    }
    public abstract void loadRawMedia();
        //forces png n jpg child classes to handle their own specific loading logic
        // java io check main for links

    // just for now, so i don't have issues, file wil be set to a default path,
    public String defaultPath(){
        this.file = "img.png";
        return this.file;
    }

    // create an array for the most recent 10 files opened.
    //Array<String>[] recentFiles= new <String> [];
    String[] recentFiles = new String[9];

    public String[] getRecentFiles() {
        return recentFiles;
    }

    public void importFile(){

        if(!validateFileExt()){
            System.out.println("File " + file + " is not an Image or Video file path");
            //System.out.println("Try file:" + file + " for type");
        }
        // array for loop cycles and adds new file names/ paths
        // then cycles back to the last one (1->10) when the tenth file is added it starts from the beginning,
        // except it replaces files instead

        int i = 0; //Moved outside the loop so position in memory
        // while program is running, keep track of 10 most recent files
        // for increment to constantly loop over recently opened/ accessed files
        if(i >= recentFiles.length){
            //i = 0;
            // restart recent file int
            System.out.println("H");
        }

        else{
            recentFiles[i] = file; //assign the actual file instead of the int 'i'
            System.out.println("h");
        }
        // technically could add a file to log to for every "recent file" and only show th emost recent 10

    }

    public boolean validateFileExt(){
        String path = getFilePath();
        //takes string path. maybe use getter? instead?
        //filtering logic to reject non image files instantly etc
        String ext = path.substring(path.indexOf("." + 1));
        // finds the last "." and reads starting the next one

        if("png".equalsIgnoreCase(ext) || "jpg".equalsIgnoreCase(ext)){
            System.out.println("Val file Ext;ImageFileClass TRUE");
            return true;
        }
        System.out.println("Val file Ext; ImageFileClass FALSE");

        return false;
    }

    public boolean validSize(){
        // checks image for image size before passing for display
        // 10 * 10 px ?
        int minSize = 10; // minimum 10 pix max 10k
        int maxSize = 10000; // hopefully this works...
        if(validateFileExt()){
            // validate file and then check size of img, determine if it can / should be displayed
            // stuff from tutorial
            ImageIcon icon = new ImageIcon(getFilePath());
            int width = icon.getIconWidth();
            int height = icon.getIconHeight();

            // validate the actual size
            if(width > minSize && height > minSize && width <= maxSize && height <=maxSize){
                System.out.println("Can be displ; ValidSize; ImageFile");
                return true;
            }
        }

        System.out.println("Something broke.. File not supported ? ");

        return false;
    }

}
// LATER MAYBE NEVER
// add functionality that allows user to crop copy whatever size of patch
// and paste onto main img to remove watermarks etc. just an overlay,
// would need to allow overwriting of img and save as dropdown.

/*
"Final_ProjectPkg.ImageFile" abstract class purpose
handles read/write to file requirements
reads from img file n parses elements from text file to display
writing to file for logs or saving metadata
possibly add / consider logging infrastructure for future expansion
base class for all media files
houses shared filtering logic n basic file validation before heavy loading
holds common metadata fields

method applyZoomFilter
takes int scale (formated as percentage
base logic for resizing the buffered image using graphics2d or something else...

method extrBaseMetaData

grabs file size n path / uses path getter
reads from text file n returns string for the text display area
throws exceptions passes to exceptions class (if a file is missing etc)
notes what metaData is expected, but missing
displayes data, and missing data. prob w toString

 */