package Final_ProjectPkg;

public class JpgImg extends ImageFile{

    public JpgImg(String file) {
        super(file);
    }

    @Override
    public void loadRawMedia() {

    }

    @Override
    public void renderToPanel() {
        // render to Quad 2 but could be controlled by JTabbed pane in Q1...
    }

    @Override
    public void zoomIn() {
    // zoom in out could def be moved just as concrete in abstract class as well as reset image, rename to clear image
    }

    @Override
    public void zoomOut() {

    }

    @Override
    public void resetImg() {

    }
}
// other stuff on how to expand / display png anything specific to jpg etc

/*

"Final_ProjectPkg.JpgImg" child class purpose
handles jpeg specific loading
focuses on rgb color space since jpgs have no transparency
constructor Final_ProjectPkg.JpgImg
takes string path parameter as argument
calls parent constructor
runs jpg specific validation etc


method checkColorSpace
verifies if image is colors cmyk or rgb
prevents weird color tinting when displaying in swing etc

method stripExifData
removes camera metadata tags for privacy / decreases file size over large amts of files.
returns cleaned buffered image

method estimateCompression
compares file size to pixel dimensions
returns string like "high compression" for metadata text display
*/
