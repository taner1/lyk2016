package anOtherApplication;

public class EBook extends Book {
	private double fileSize;
	private String encodingFormat;
	private int numDevicesBeingUsed=0;
public EBook(String name, String author, String bookId,double fileSize,String encodingFormat,int numDevicesBeingUsed) {
		super(name, author, bookId);
		this.fileSize=fileSize;
		this.encodingFormat=encodingFormat;
		this.numDevicesBeingUsed=numDevicesBeingUsed;
		// TODO Auto-generated constructor stub
	}

public boolean addDevice(){
	if(numDevicesBeingUsed>100) return false;
	else numDevicesBeingUsed++; return true;
}
public boolean removeDevice;
public double getFileSize() {
	return fileSize;
}
public void setFileSize(double fileSize) {
	this.fileSize = fileSize;
}
public String getEncodingFormat() {
	return encodingFormat;
}
public void setEncodingFormat(String encodingFormat) {
	this.encodingFormat = encodingFormat;
}
public int getNumDevicesBeingUsed() {
	return numDevicesBeingUsed;
}
public void setNumDevicesBeingUsed(int numDevicesBeingUsed) {
	this.numDevicesBeingUsed = numDevicesBeingUsed;
}

}