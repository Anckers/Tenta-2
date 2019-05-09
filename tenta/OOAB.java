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

	/*
	 * public void addDotterbolag(Dotterbolag dotterbolag) {
	 * this.dotterbolagList.add(dotterbolag); }
	 */
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

	public void setDotterbolagList(ArrayList<Dotterbolag> dotterbolagList) {
		this.dotterbolagList = dotterbolagList;
	}

	public ArrayList<Dotterbolag> getDotterbolagList() {
		return dotterbolagList;
	}

	public void laggTillDotterbolag(Dotterbolag d) {
		this.dotterbolagList.add(d);
	}

	public void laggTillAnställd(String dotterNr, Anstalld anstalld) {
		for (Dotterbolag tmpDotterbolag : dotterbolagList) {
			if (tmpDotterbolag.getNr().equals(dotterNr)) {
				tmpDotterbolag.addAnstalld(anstalld);
			}
		}
	}

	public Dotterbolag hittaDotterbolag(String nr) {
		for (Dotterbolag tmpDotterbolad : dotterbolagList) {
			if (tmpDotterbolad.getNr().equals(nr)) {
				return tmpDotterbolad;
			}
		}
		return null;
	}

	public double totalSalary() {
		double totalSalary = 0;
		for (Dotterbolag tmpDotterbolag : dotterbolagList) {
			totalSalary += tmpDotterbolag.totalSalary();
		}
		return totalSalary;
	}

	public Anstalld hittaAnstalld(String pnr) {
		for (Dotterbolag tmpDotterbolag : dotterbolagList) {
			return tmpDotterbolag.hittaAnstalld(pnr);
		}
		return null;
	}
}
