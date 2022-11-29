package chapters.chapter_12.Exercises.Exercise_18;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_18 {

    public static void main(String[] args) throws Exception{

        if (args.length != 1) {
            System.out.println("Usage: srcRootDirectory");
            System.exit(1);
        }

        // Check if source file exists
        File rootDirectory = new File(args[0]);  //"C:\\Users\\90543\\Desktop\\Java\\srcRootDirectory"
        if (!rootDirectory.exists()) {
            System.out.println("Directory file " + args[0] + " does not exist");
            System.exit(2);
        }
        if(!rootDirectory.isDirectory()){
            System.out.println(rootDirectory.getName() + " is not a directory");
            System.exit(3);
        }

        ArrayList<File> directoryList = getDirectories(rootDirectory);

        //ArrayList<File> files = getFiles(directoryList);    buraya tanımlarsak sadece ilk dosyada işlem yapıyor!!??

        while (!directoryList.isEmpty()){

            ArrayList<File> files = getFiles(directoryList);
            addPackageName(files, directoryList.get(0));
            directoryList.remove(0);
        }
    }

    public static ArrayList<File> getDirectories(File rootDirectory){

        ArrayList<File> directories = new ArrayList<>();

        for(int i = 1; i <= 34; i++) {

            directories.add(new File(rootDirectory, "chapter" + (i < 10 ? "0" : "") + i));
        }
        return directories;
    }
    public static ArrayList<File> getFiles(ArrayList<File> directory){

        if(!directory.get(0).isDirectory()){
            System.exit(0);
        }
        ArrayList<File> list = new ArrayList<>(Arrays.asList(directory.get(0).listFiles()));

        for(int i = 0; i < list.size(); i++) {

            String str = list.get(i).getName();

            if(!str.substring(str.lastIndexOf(".")).equals(".java")){

                list.remove(i);
            }
        }
        return list;
    }
    public static void addPackageName(ArrayList<File> list, File directory) throws Exception {

        for(int i = 0; i < list.size(); i++) {
            ArrayList<String> packageName = new ArrayList<>();
            packageName.add("package " + directory.getName() + ";");

            try (Scanner input = new Scanner(list.get(i))){

                while (input.hasNext()){

                    packageName.add(input.nextLine());
                }
            }
            try (PrintWriter output = new PrintWriter(list.get(i))){

                for(int j = 0; j < packageName.size(); j++) {

                    output.println(packageName.get(j));
                }
            }
        }
    }
}
