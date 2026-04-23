package Final_ProjectPkg;

public interface Display {
    public void renderToPanel();
    //takes swing jpanel as argument
    //paints the current media onto the main right side frame

    public void zoomIn();
    //increases scale factor

    //NOTE:** both triggers ui repaint etc

    public void zoomOut();
    //decreases scale factor
    //prevents zooming smaller than 1 pixel etc

    public void resetImg();

}

/*

"Final_ProjectPkg.Display" interface purpose
standardizes how any media (images now, video later) interacts with the ui
decouples actual file data from java swing components
forces child classes to implement zoom in / zoom out tools etc

method resetView
returns scale to 100 percent
centers the image in the frame

method getPreviewIcon
returns a scaled down instance for the small top left preview box
*/