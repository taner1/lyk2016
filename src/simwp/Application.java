package simwp;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import examplepackage.Example;

public class Application {
	static Scanner scanner = new Scanner(System.in);
	static int input = 0;

	public static void main(String[] args) throws IOException {
		while (true) {
			Menu.printMainMenu();
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Enter a number");
				scanner.nextLine();
				continue;
			}

			switch (input) {
			case 0:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			case 1:
				addPageMenu();
				break;
			case 2:
				addPostMenu();
				break;
			case 3:
				addCommentMenu();
				break;
			case 4:
				showPagesMenu();
				break;
			case 5:
				showPostsMenu();
				break;
			case 6:
			BlogHelper.Export();
			default:
				System.out.println("Error: There is no such menu!");
				break;
			}
		}

	}

	public static void addPageMenu() {
		Menu.printAddPageMenu();
		String title = "";
		String body = "";
		String category = "";
		System.out.println("Title: ");
		scanner.nextLine();
		title = scanner.nextLine();
		System.out.println("Body: ");
		body = scanner.nextLine();
		System.out.println("Category: ");
		category = scanner.nextLine();

		Page page = new Page(title, body, category);
		BlogHelper.addPage(page);
	}

	public static void addPostMenu() {
		Menu.printAddPostMenu();
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Enter a number");
			return;
		}
		if (input == 1) {
			Menu.printAddVideoPostMenu();
			String title = "";
			String body = "";
			String category = "";
			String url = "";
			System.out.println("Title: ");
			scanner.nextLine();
			title = scanner.nextLine();
			System.out.println("Body: ");
			body = scanner.nextLine();
			System.out.println("Category: ");
			category = scanner.nextLine();
			System.out.println("Url: ");
			boolean done= false;
			String url2 = scanner.nextLine();
			while(!done){
			try{
				URL uri = new URL(url2);
				done=true;
				url=url2;
				}
				catch(MalformedURLException ex){
		System.out.println("Please enter a valid uri(http:// or https:// prefix must be added)");
		  url2 = scanner.nextLine();
				}
			}

			VideoPost vPost = new VideoPost(title, body, category, url);
			BlogHelper.addPost(vPost);
		} else if (input == 2) {
			Menu.printAddTextPostMenu();
			String title = "";
			String body = "";
			String category = "";
			System.out.println("Title: ");
			scanner.nextLine();
			title = scanner.nextLine();
			System.out.println("Body: ");
			body = scanner.nextLine();
			System.out.println("Category: ");
			category = scanner.nextLine();

			TextPost tPost = new TextPost(title, body, category);
			BlogHelper.addPost(tPost);
		}
		else{
			System.out.println("Error: There is no such post type!");
		}
	}

	public static void addCommentMenu() {
		Menu.printAddCommentMenu();
		int postIndex = 0;
		String author = "";
		String text = "";
		if (BlogHelper.hasPosts()) {
			System.out.println("Choose a post to comment.");
			try {
				postIndex = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: Index has to be a number");
				return;
			}
			System.out.println("Author: ");
			scanner.nextLine();
			author = scanner.nextLine();
			System.out.println("Text: ");
			text = scanner.nextLine();
			Comment comment = new Comment(author, text);
			BlogHelper.addComment(postIndex - 1, comment);
		} else {
			System.out.println("Press a key to go back.");
			scanner.nextLine();
			scanner.nextLine();
		}
	}

	public static void showPagesMenu() {
		Menu.printPages();
		System.out.println("Press a key.");
		scanner.nextLine();
		scanner.nextLine();
	}

	public static void showPostsMenu() throws IOException {
		Menu.printPosts();
		System.out.println("Press a key.");
		scanner.nextLine();
		scanner.nextLine();
	}
}
