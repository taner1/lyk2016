package simwp;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BlogHelper {

	private static List<Page> pages = new ArrayList<>();
	private static List<Post> posts = new ArrayList<>();

	public static void addPage(Page page) {
		pages.add(page);
	}

	public static void addPost(Post post) {
		posts.add(post);
	}

	public static void addComment(int postIndex, Comment comment) {
		posts.get(postIndex).addComment(comment);
	}

	public static Iterator<Page> getPages() {
		return pages.iterator();
	}

	public static Iterator<Post> getPosts() {
		return posts.iterator();
	}

	public static void Export() throws IOException{
		FileOperations.createFile("C:/users/tr/appExport.txt");
	}
}