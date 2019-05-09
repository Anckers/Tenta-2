package tenta;

import java.util.ArrayList;

public class OOAB {
	private String nr;
	private String namn;
	private ArrayList<Dotterbolag> dotterbolagList = new ArrayList<Dotterbolag>();
	
	public OOAB(String nr, String namn) {
		setNr(nr);
		setNamn(namn);
	}
	public void addDotterbolag(Dotterbolag dotterbolag) {
		this.dotterbolagList.add(dotterbolag);
	}
	
	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getNr() {
		return nr;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public String getNamn() {
		return namn;
	}

}
