package entity;

public class Customer 
{
	private int cid;
	private String cname;
	private long phno;
	private Address a;
	private String roomtype;
	private double roomprice;
	private int roomno;
	public Customer(int cid, String cname, long phno, Address a, String roomtype, double roomprice, int roomno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.phno = phno;
		this.a = a;
		this.roomtype = roomtype;
		this.roomprice = roomprice;
		this.roomno = roomno;
	}
	
	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	private long getPhno() {
		return phno;
	}
	
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Address getA() {
		return a;
	}
	
	public void setA(Address a) {
		this.a = a;
	}
	
	public String getRoomtype() {
		return roomtype;
	}
	
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	
	public double getRoomprice() {
		return roomprice;
	}
	
	public void setRoomprice(double roomprice) {
		this.roomprice = roomprice;
	}
	
	public int getRoomno() {
		return roomno;
	}
	
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	
	

}
