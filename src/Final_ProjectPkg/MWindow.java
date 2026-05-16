package Final_ProjectPkg;

import javax.swing.*;
import java.awt.*;

public class MWindow extends JFrame{


    String fileInput;
    // take input, use try except block from Exceptions to chek file. input through this class
    JpgImg jpg;
    PngImg png;// objects added to allow git push from inteliji.


    // added this class and did the same changes to the "Final code to keep it close"
    public MWindow(){

        // name of the entire window inside wich buttons etc will be
        JFrame window = new JFrame("Final_ProjectPkg.Main Window");

        window.setSize(600, 500); // width * height
        window.setLocation(0,0); // x,y
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLayout(new BorderLayout());
        window.setBackground(Color.GRAY);


        SwingUi imagePanel = new SwingUi();
        window.add(imagePanel);

        window.setVisible(true);

        // FIXME adding a window to a container. ERROR
        // main window logic here ONLY everything else oes SwingUi class
        //window.add(Q1, BorderLayout.NORTH);
        //window.add( Q1, BorderLayout.CENTER);
        // top and center will adjust everything later.
        // border layout
    }

}
