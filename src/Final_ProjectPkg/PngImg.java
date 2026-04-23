package Final_ProjectPkg;

public class PngImg extends ImageFile{
    public PngImg(String file) {
        super(file);
    }

    // other stuff on how to expand / display png anything specific to png

}



/*
"Final_ProjectPkg.PngImg" child class purpose
handles png specific loading
focuses on alpha transparency channels
constructor Final_ProjectPkg.PngImg
takes string path parameter
calls parent constructor
runs png specific validation etc
override method loadRawMedia
uses imageio to read file
handles argb color space loading
method checkAlphaChannel
verifies if image has transparency
flags if background needs special rendering in swing etc
method removeGammaCorrection
strips color profile to prevent washed out display
returns cleaned buffered image
method estimateCompression
compares raw pixel size to file size on disk
returns string for metadata text display
 */