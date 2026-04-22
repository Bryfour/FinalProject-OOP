public class JpgImg extends ImageFile{

    public JpgImg(String file) {
        super(file);
    }
}
// other stuff on how to expand / display png anything specific to jpg etc

/*

concrete class extending image file
fulfills polymorphism requirement via overriding
    -- using the ImgF method that works with gneral images etc

constructor calls super(file)
specific logic for this image type
how it reads the specific file format etc

throws invalid image exception if file corrupt etc
    -- exception login=c will be in the excpt class, this might need to be in main
*/