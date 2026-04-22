public abstract class ImageFile implements Display{
//import java.util.

    String file;

    public ImageFile(String file){
        this.file = file;
        // takes file input and stores it... for now the file path will be a string
        // current file

    }

    // create an array for the most recent 10 files opened.
    //Array<String>[] recentFiles= new <String> [];
    String[] recentFiles = new String[9];

    public String[] getRecentFiles() {
        return recentFiles;
    }

    System.out.println("Try file:" + file + " for type");

    System.out.println("File " + file + " is not an Image or Video file path");

    public void checkFile(){
        //
    }

    // array for loop cycles and adds new file names/ paths
    // then cycles back to the last one (1->10) when the tenth file is added it starts from the beginning,
    // except it replaces files instead

    // while program is running, keep track of 10 most recent files
    while(true){
        int i = 0;
        // for increment to constantly loop over recently opened/ accessed files


        if(i >= recentFiles.length){
            i = 0;
            // restart recent file int
        }

        else{
            recentFiles.add(i);
            i++;
        }
        // technically could add a file to log to for every "recent file" and only show th emost recent 10

    }



}



/*

abstract class for inheritance requirement
base class for specific image types (jpeg, png etc) backbone
constructor takes file object
sets file path
prob basic validation here
common vars grouped here
implements the ui interface- dsiplay

*/
/*

handles read/write to file requirements
reads from img or vid file (metadata etc)
parses elements from text file to display
takes imagefile object as parameter (classes passing objects etc)
writing to file for logs or saving metadata
possibly add / consider logging infrastructure for future expansion
throws exceptions passes to exceptions class
    for ex: if a file is missing

*/