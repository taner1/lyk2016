package tr.org.kurek;


public class ExecutableFile extends BinaryFile {
	
	private String platform;
	private byte[] contents;
	
	public ExecutableFile(long size, String name, String platform, byte[] contents) {
		super(size, name);
		
		if (platform=="Debian on Intel" || platform=="Android on ARM") {
			this.platform = platform;
		}
		this.contents = contents;	}

	
	
	@Override
	public void onClick() {
		System.out.println("Clementine Workings ! ");
	}
	
	public String toString(){
		return "Platform: " + platform + " | Contents: " + contents;
	}
	
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public byte[] getContents() {
		return contents;
	}

	public void setContents(byte[] contents) {
		this.contents = contents;
	}
	
	

}
