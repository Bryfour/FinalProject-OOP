package Final_ProjectPkg;

public abstract class ImageFile implements Display{
//import java.util.

    String file;

    public ImageFile(String file){
        this.file = file;
        // takes file input and stores it... for now the file path will be a string
        // current file

    }
    // just for now, so i don't have issues, file wil be set to a default path,
    public void defaultPath(){
        this.file = "";
    }

    // create an array for the most recent 10 files opened.
    //Array<String>[] recentFiles= new <String> [];
    String[] recentFiles = new String[9];

    public String[] getRecentFiles() {
        return recentFiles;
    }

    public void importFile(String path){
        System.out.println("Try file:" + file + " for type");

        System.out.println("File " + file + " is not an Image or Video file path");
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



}



/*
"Final_ProjectPkg.ImageFile" abstract class purpose
handles read/write to file requirements
reads from img file n parses elements from text file to display
writing to file for logs or saving metadata
possibly add / consider logging infrastructure for future expansion
base class for all media files
houses shared filtering logic n basic file validation before heavy loading
holds common metadata fields
method validateFileExtension
takes string path
filtering logic to reject non image files instantly etc
method applyZoomFilter
takes integer scale
base logic for resizing the buffered image using graphics2d
method extractBaseMetadata
grabs file size n path
reads from text file n returns string for the text display area
throws exceptions passes to exceptions class (if a file is missing etc)
method getFilePath
simple getter for the path string
abstract method loadRawMedia
forces png n jpg child classes to handle their own specific loading logic

 */