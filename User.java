
public class User {
	private String unm,uid;
	 static int id=10;
	public User(String nm)
	{
		this.unm=nm;
		this.uid=" "+id++;
	}
	
	public String getUnm() {
		return unm;
	}
	public void setUnm(String unm) {
		this.unm = unm;
	}
	public String getUid() {
		return uid;
	}
	public void dispUs() {
		System.out.println("User [ uid=" + uid +" unm= " + unm  +" ]");
	}
	

}
