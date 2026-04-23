package Final_ProjectPkg;

public class PngImg extends ImageFile{
    public PngImg(String file) {
        super(file);
    }

    @Override
    public void loadRawMedia() {

    }

    @Override
    public void renderToPanel() {

    }

    @Override
    public void zoomIn() {

    }

    @Override
    public void zoomOut() {

    }

    @Override
    public void resetImg() {

    }

    public void setTransparency(int value){
        // amount of transparency, show as a % in pop up when mouse goes on button.
        // show for 1 second after mouse is moved. mouse immediately shows.
    }

    // other stuff on how to expand / display png anything specific to png

    public void checkTransparency(){
        //verifies if image has transparency
        //flags if background needs special rendering in swing etc
    }

}



/*
"Final_ProjectPkg.PngImg" child class purpose
handles png specific loading
focuses on alpha transparency channels-- using slider to change. not sure where place yet
constructor Final_ProjectPkg.PngImg
takes string path parameter
calls parent constructor
runs png specific validation etc

method removeGammaCorrection
strips color profile to prevent washed out display
returns cleaned buffered image

method estimateCompression
compares raw pixel size to file size on disk
returns string for metadata text display
 */