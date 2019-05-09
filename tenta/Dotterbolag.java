package tenta;
import java.util.ArrayList;

public class Dotterbolag {
	private String nr;
	private String namn;
	private OOAB oOAB;
	private ArrayList<Anstalld> anstalldList = new ArrayList<Anstalld>();
	private ArrayList<Projekt> projektList = new ArrayList<Projekt>();
		
	public Dotterbolag(String nr, String namn, OOAB oOAB) {
		setNr(nr);
		setNamn(namn);
		setOOAB(oOAB);
	}
	
	public ArrayList<Anstalld> getAnstalldList() {
		return anstalldList;
	}

	public void setAnstalldList(ArrayList<Anstalld> anstalldList) {
		this.anstalldList = anstalldList;
	}

	public ArrayList<Projekt> getProjektList() {
		return projektList;
	}

	public void setProjektList(ArrayList<Projekt> projektList) {
		this.projektList = projektList;
	}

	public void setNr(String nr) {
		this.nr=nr;
	}
	public String getNr() {
		return nr;
	}
	public void setNamn(String namn) {
		this.namn=namn;
	}
	public String getNamn() {
		return namn;
	}
	public void setOOAB(OOAB oOAB) {
		this.oOAB=oOAB;
	}
	public OOAB getOOAB() {
		return oOAB;
	}
	public void addAnstalld(Anstalld anstalld) {
		this.anstalldList.add(anstalld);
	}
	public Anstalld hittaAnstalld(String pnr) {
		for(Anstalld tmpAnstalld : anstalldList) {
			if(tmpAnstalld.getPnr().equals(pnr));{
				return tmpAnstalld;
			}
		}
		return null;
	}
	public double totalSalary() {
		double totalSalary = 0;
		for(Anstalld tmpAnstalld : anstalldList) {
			totalSalary += tmpAnstalld.getSalary();
		}
		return totalSalary;
	}
	
	public void addProjekt(Projekt projekt) {
		this.projektList.add(projekt);
	}
	public Projekt findProjekt(String namn) {
		for(Projekt tmpProjekt : projektList) {
			if(tmpProjekt.getNamn().equals(namn)) {
				return tmpProjekt;
			}
		}
		return null;
	}
}
