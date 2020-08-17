import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IOStream {
    public static String readContentFromFile(String path) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        System.out.println(lines);
        return  "";
    }
    public static void writeContentToFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success...");
    }
    public static void AppendContentToFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path,true);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Append Success...");
    }
    public static File findFileByName(String folderPath, String fileName){
        File f = new File(folderPath);
        FilenameFilter fnf = new FilenameFilter() {
            @Override
            public boolean accept(File f, String filename) {
                return true;
            }
        };
        if(fnf.accept(f, fileName)){
            File f1= new File("D:/"+fileName);
            return f1;
        }
        return f;
    }

    public static void main(String[] args) {
        try {
            writeContentToFile("D:/learE.txt");
            findFileByName("D:/", "learE.txt");
            AppendContentToFile("D:/learE.txt");
            readContentFromFile("D:/learE.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
