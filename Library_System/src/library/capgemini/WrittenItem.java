package library.capgemini;

public abstract class WrittenItem extends Item {
	
	String authorString;

	public String getAuthorString() {
		return authorString;
	}

	public void setAuthorString(String authorString) {
		this.authorString = authorString;
	}
	
	public abstract void showWrittenItem();
	

}
