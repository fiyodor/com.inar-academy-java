package chapters.chapter_12.Exercises.Exercise_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exercise_18_CreateFiles {

    public static void main(String[] args) throws Exception {

        ArrayList<File> directories = new ArrayList<>();

        for(int i = 1; i <= 34; i++) {
            File directory = new File("C:\\Users\\90543\\Desktop\\Java\\srcRootDirectory\\chapter" + (i < 10 ? "0" : "") + i);
            if(!directory.isDirectory()){
                if(directory.mkdir()){
                    directories.add(directory);
                }
            }
        }

        produceFiles(directories);
    }
    public static void produceFiles(ArrayList<File> dir) throws FileNotFoundException {

        for(int i = 0; i < dir.size(); i++) {

            produceFiles(5, dir.get(i), "Java", ".java");

        }
    }

    public static void produceFiles(int n, File dir, String fileName, String fileType) throws FileNotFoundException{

        for(int i = 1; i <= n; i++) {

            File file = new File(dir, fileName + i + fileType);
            if(!file.exists()){

                try (PrintWriter output = new PrintWriter(file)){

                    for(int j = 0; j < 26; j++) {

                        output.print((char)('A' + j) + " ");
                    }
                }
            }
        }
    }
}
