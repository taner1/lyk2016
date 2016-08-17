
package examplepackage;

import java.io.IOException;
public class ExampleTest {

	public static void main(String args[]) throws IOException {

		Example.createDirectory("C:/home/cylon/hede/");

		Example.createFile("C:/home/cylon/hede/readme.md");

		Example.writeToFile("ASDFG","C:/home/cylon/hede/readme.md");

		Example.readFile("C:/home/cylon/hede/readme.md");

	}

}