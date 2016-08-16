package tr.org.kurek;

import java.util.Date;

public abstract class File {
	
	private	long size;
	private String name;
	private Date dateCreated;
	  
	public File(long size, String name) {
		this.size = size;
		this.name = name;
	}

	public abstract void onClick();
	
	public String toString(){
		return "Size: " + size + " | Name: " + name + " | Date: " + dateCreated;
	}

	public long getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public void setName(String name) {
		if (!name.contains(" ")) {
			this.name = name;
		}
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
}
