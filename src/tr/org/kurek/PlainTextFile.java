package tr.org.kurek;


public class PlainTextFile extends TextFile{
	
	public PlainTextFile(long size, String name, String encoding, long numChars) {
		super(size, name, encoding, numChars);
		// TODO Auto-generated constructor stub
	}

	private String[] lines;	
	
	
	public String toString(){
		return "Lines : " + lines;
	}
	
	
	@Override
	public void onClick() {
		System.out.println("Lines: " + lines);
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	public String[] getLines() {
		return lines;
	}

	public void setLines(String[] lines) {
		this.lines = lines;
	}
	
	
}
