package tenta;

public class Anstalld {
	
	private String pnr;
	private String namn;
	private double salary;
	private Dotterbolag dotterbolag;
	
	
	public Anstalld(String pnr, String namn, double salary, Dotterbolag dotterbolag) {
		setPnr(pnr);
		setNamn(namn);
		setSalary(salary);
		setDotterbolag(dotterbolag);
	}
	
	
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Dotterbolag getDotterbolag() {
		return dotterbolag;
	}
	public void setDotterbolag(Dotterbolag dotterbolag) {
		this.dotterbolag = dotterbolag;
	}
	
	
}
