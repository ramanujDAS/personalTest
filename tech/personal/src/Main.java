package  tech.personal.src;

import com.sun.javafx.binding.Logging;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

    printClassLoader();
    }

     public static void printClassLoader() throws ClassNotFoundException {
         System.out.println("Classloader of Logging:"
                 + Logging.class.getClassLoader());

         System.out.println("Classloader of ArrayList:"
                 + ArrayList.class.getClassLoader());

         CustomClassLoader customClassLoader = new CustomClassLoader();

         customClassLoader.findClass("/Users/ramanujsingh/personalTest/out/production/personalTest/tech/personal/src/MyClass.class");

     }
}
