package revature_programs;


import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
 
import javax.imageio.ImageIO;
 
public class ImageIOJavaExample {
    public static void main(String args[]) throws Exception{    
        URL imageURL = new URL("/home/_venom_/Downloads/lion.jpg");
        BufferedImage bi = ImageIO.read(imageURL);
         
        ImageIO.write(bi, "jpg", new File("/home/_venom_/Downloads/lion_copy.jpg"));
        System.out.println("Copied!");
    }
}