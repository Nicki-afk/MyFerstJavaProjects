package configFiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSettings {

    private File file;
    private FileWriter writer;
    private FileReader reader;

    public FileSettings(String name_file){
            file = new File(name_file);
    }
    public FileSettings(File file){
        this.file = file;

    }


    public FileSettings writeTextFile(String text){

        try {
            writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();

        }
        return  this;
    }
    public String readToFile() throws IOException {
        int c; String inf = "";
        try {
            reader = new FileReader(file);
            while((c=reader.read()) != -1){
                inf += (char)c;


            }
        }catch (Exception e){

        }
        if(inf.length() >= 2) {
            reader.close();
            return inf;

        }else{
            return null;
        }

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}