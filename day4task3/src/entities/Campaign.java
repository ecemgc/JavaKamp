package entities;

public class Campaign {

	private String campName;
	private int deadline;
	private int discount;
	
	public Campaign() {
		
	}
		
	
	public Campaign(String campName, int deadline, int discount) {
		super();
		this.campName = campName;
		this.deadline = deadline;
		this.discount = discount;

		
	}


	public String getCampName() {
		return campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
	


