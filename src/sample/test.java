package sample;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class test {
    static void create(String path,String Name,String aurl) {
            BufferedImage image =null;
            try{
                URL url =new URL(aurl);
                     // read the url
                        image = ImageIO.read(url);

//                for png
                ImageIO.write(image, "png",new File(path+"\\"+Name+".png"));

                // for jpg
//                ImageIO.write(image, "jpg",new File("have_a_question.jpg"));
            }catch(IOException e){
                e.printStackTrace();
            }
    }
}
