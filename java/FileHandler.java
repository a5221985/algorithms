import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    void writeAndClose(String fileName, WritingProcess process) {
        try {
            File file = new File(fileName);
            file.createNewFile();
            invokeProcess(process, file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    void invokeProcess(WritingProcess process, File file) {
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
	    process.execute(bw);
	} catch (IllegalArgumentException | IOException | SecurityException e) {
	    e.printStackTrace();
	}
    }

    public String readAndClose(String fileName, ReadingProcess process) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            return invokeProcess(process, file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    String invokeProcess(ReadingProcess process, File file) {
	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	    return process.execute(br);
	} catch (IllegalArgumentException | IOException | SecurityException e) {
	    e.printStackTrace();
	}
        return "";
    }

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        fh.writeAndClose("/Users/am/Documents/temp.txt", 
                 bufferedWriter -> bufferedWriter.write("Alhamdulillah!\n"));

        System.out.println(fh.readAndClose("/Users/am/Documents/temp.txt", 
                 bufferedReader -> bufferedReader.readLine()));
        System.out.println(fh.readAndClose("/Users/am/Documents/java_wikipedia_article.txt", 
                 bufferedReader -> {
                     StringBuilder sb = new StringBuilder();
                     String line = null;
                     while ((line = bufferedReader.readLine()) != null)
                         sb.append(line);
                     return sb.toString();
                 }));
    }
}

interface ReadingProcess {
    String execute(BufferedReader bufferedReader) throws IOException;
}

interface WritingProcess {
    void execute(BufferedWriter bufferedWriter) throws IOException;
}
