package lyk2016.todo;

public class InvalidInputException extends Exception {
public InvalidInputException(String input){ 
	if(input>4) {
	throw new InvalidInputException("you need to input a value range from 0 to 4");
}
}
}
