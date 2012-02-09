package javahosttest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;


public class HandleFile {

    public String readFromFile(String filename) {
        File file = new File(filename);
        int ch;
        StringBuilder strContent = new StringBuilder("");
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);
            while ((ch = fin.read()) != -1) {
                strContent.append((char) ch);
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strContent.toString();
    }

    public String getNewFileName() {
        String filename = "new.txt";
        File file = new File(filename);
        int i = 0;

        while (file.exists()) {
            filename = "new" + i++ + ".txt";
            file = new File(filename);
        }
        return filename;
    }

    public void writeToFile(String text) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(getNewFileName()), true));
            bw.write(text);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
