/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serial_key_manager;

/**
 *
 * @author stark
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileArrayProvider {

    private static FileArrayProvider instence = null;

    public FileArrayProvider() {
    }

    public static synchronized FileArrayProvider getInstence() {
        if (instence == null) {
            instence = new FileArrayProvider();
        }
        return instence;
    }

    public String[] readLines(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);
    }
    
    
   
//    public static void main(String[] args) {
//        FileArrayProvider ff = new FileArrayProvider();
//        try {
//            for (int i = 0; i < ff.readLines("serials.keys").length; i++) {
//                String string = ff.readLines("serials.keys")[i];
//                System.out.println("" + string);
//            }
//
//        } catch (IOException ex) {
//        }
//    }
}