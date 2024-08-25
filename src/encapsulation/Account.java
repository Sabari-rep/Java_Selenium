package encapsulation;

//*********In Eclipse click Source tab to generate the getters & setters method 

public class Account {
	
	private int accno;
	private String name;
	private double amount;
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setAccno(12345);
		acc.setName("Sabari");
		acc.setAmount(2300211.23);
		
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}
	
	
	
	
	

}
