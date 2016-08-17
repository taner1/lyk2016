package lyk2016.todo;

import java.util.Scanner;
import java.util.logging.Logger;

import lyk2016.todo.Menu;
import lyk2016.todo.Todo;
import lyk2016.todo.TodoHelper;

public class Application {

	public static void main(String[] args) {
		String input = "";
		String input2 ="";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Menu.printMenu();
			input = scanner.nextLine();

			processInput(input);
		}

	}

	private static void processInput(String input) {
		if(input.length=0){
			System.out.println("input value cannot be null");
		}
		input=input.trim();
		String[] inputParams = input.split(",");
		try{
			int action = Integer.parseInt(inputParams[0]);
	}catch(NumberFormatException e|){
	System.out.println("ERROR: need a number");
	return;
	}

int action = Integer.parseInt(inputParams[0]);

String param = null;
		if (inputParams.length > 1) {
			
			param = inputParams[1];
		}

		System.out.println("[debug] action: " + action);
		System.out.println("[debug] param: " + param);

		int index;
		switch (action) {
		case 0:
			System.out.println("Exiting...");
			System.exit(0);
		case 1:
			Todo newTodo = new Todo(param);
			TodoHelper.add(newTodo);
			break;
		case 2:
			index = Integer.parseInt(param);
			TodoHelper.mark(index - 1, true);
			break;
		case 3:
			index = Integer.parseInt(param);
			TodoHelper.remove(index - 1);
			break;
		case 4:
			index = Integer.parseInt(param);
			TodoHelper.mark(index - 1,false);
			break;
		default:
			break;
		}

	}
}
