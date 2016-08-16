package tr.org.kurek;


public abstract class TextFile extends File{

	private String encoding;
	private long numChars;
	
	public TextFile (long size, String name , String encoding, long numChars){
		super(size, name);
		this.encoding = encoding;
		this.numChars = numChars;
	}
	
	public abstract void clear();

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		
		if (encoding=="ASCII" || encoding=="Unicode" || encoding =="DOS") {
			this.encoding = encoding;
		}
	}

	public long getNumChars() {
		return numChars;
	}

	public void setNumChars(long numChars) {
		this.numChars = numChars;
	}
	
	
}
