public class JpgImg extends ImageFile{

    public JpgImg(String file) {
        super(file);
    }


}
// other stuff on how to expand / display png anything specific to jpg etc

/*

"JpgImg" child class purpose
handles jpeg specific loading
focuses on rgb color space since jpgs have no transparency
constructor JpgImg
takes string path parameter as argument
calls parent constructor
runs jpg specific validation etc
override method loadRawMedia
uses imageio to read file
handles standard rgb color space loading
method checkColorSpace
verifies if image is cmyk or rgb
prevents weird color tinting when displaying in swing etc
method stripExifData
removes camera metadata tags for privacy
returns cleaned buffered image
method estimateCompression
compares file size to pixel dimensions
returns string like "high compression" for metadata text display
*/
