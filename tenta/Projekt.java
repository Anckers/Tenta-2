package tenta;

public class Projekt {
	private String namn;
	private double budget;
	private Dotterbolag dotterbolag;

	public Projekt(String namn, double budget, Dotterbolag dotterbolag) {
		setName(namn);
		setBudget(budget);
		setDotterbolag(dotterbolag);
	}

	public void setName(String namn) {
		this.namn = namn;
	}

	public String getNamn() {
		return namn;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}
	
	public void setDotterbolag(Dotterbolag dotterbolag) {
		this.dotterbolag = dotterbolag;
	}
	
	public Dotterbolag getDotterbolag() {
		return dotterbolag;
	}
	
}
