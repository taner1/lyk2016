package anOtherApplication;

public class Book {
private String name;
private String author;
private String bookId;
private int Price;
public Book(String name,String author,String bookId){
	this.setName(name);
	this.setAuthor(author);
	this.setBookId(bookId);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;

}
}
