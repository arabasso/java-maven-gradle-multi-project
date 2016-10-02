package sk.host.arabasso.app;

import sk.host.arabasso.core.CoreBundle;

import java.util.ResourceBundle;

/**
 * Created by arabasso on 02/10/2016.
 * Example of Java multi project
 */
public class Application {
    public static void main(String [] args){
        try {
            ResourceBundle bundle = CoreBundle.getBundle("messages");

            System.out.println(bundle.getString("title"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
