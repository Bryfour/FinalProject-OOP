/*
public class Exceptions {
    public boolean isImage; // is it an image or non functioning file. image = true
    //public boolean isVideo;// later-- unimportant for now

    public boolean checkFile(String file){
        // check if it is an accepted file type.
        // search for exceptions by java, then use this
        try{
            System.out.println("Try file:" + file + " for type");

            return true;
        }
        catch (){
            System.out.println("File " + file + " is not an Image or Video file path");

            return false;

        }

    }


}
*/

/*

exception class for all exceptions.
    - make sure at least basic program functions
        -so i can always keep adding stuff and have a fallback
extends standard java exception
constructor takes string msg
triggered during file read if not displayable image
caught in main for ui pop ups etc

*/