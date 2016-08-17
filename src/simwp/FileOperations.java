package simwp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
	public static void createDirectory(String dir) throws IOException {
		try {
			Files.createDirectories(Paths.get(dir));
			System.out.println(dir + " oluþturuldu.");
		} catch (FileAlreadyExistsException e) {
			System.out.println("Dizin zaten var.");
		}

	}

	public static void createFile(String pathAndFile) throws IOException {

	 try {
			Path FilePath = Paths.get(pathAndFile);
			Files.createFile(FilePath);
			System.out.println(pathAndFile + " oluþturuldu.");
	} catch (FileAlreadyExistsException e) {
		System.out.println("Dosya zaten var.");
		}
        

	}

	public static void writeToFile(String hede, String pathAndFile) throws IOException {

		Files.write(Paths.get(pathAndFile), hede.getBytes());
		 System.out.println(hede + ", " + pathAndFile + " dizinine yazdýrýldý.");

	}

	public static void readFile(String pathAndFile) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get(pathAndFile));

		for (String line : lines) {

			System.out.println("Okunan hede: " + line);

		}
		
	}
	public static void writer(String file, List<Page> pages)
            throws IOException {
        FileWriter writer = new FileWriter(file + ".txt");
        int size = pages.size();
        for (int i=0;i<size;i++) {
            String str = pages.get(i).toString();
            writer.write(str);
            if(i < size-1)//This prevent creating a blank like at the end of the file**
                writer.write("\n");
        }
        writer.close();
    }
}
