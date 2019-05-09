package tenta;

public class Testklass {
	public static void main(String args[]) {
	OOAB mB = new OOAB("556512", "Acme AB");
	
	Dotterbolag dSWE = new Dotterbolag("1a", "Acme Sweden", mB);
	Dotterbolag dDK = new Dotterbolag("1b", "Acme Denmark", mB);
	mB.laggTillDotterbolag(dSWE);
	mB.laggTillDotterbolag(dDK);
	
	Projekt p1 = new Projekt("Nyinvestering", 1000000, dSWE);
	Projekt p2 = new Projekt("Databaser", 300000, dDK);
	Projekt p3 = new Projekt("Underhåll", 500000, dDK);
	dSWE.addProjekt(p1);
	dDK.addProjekt(p2);
	dDK.addProjekt(p3);
	
	Anstalld aDK1 = new Anstalld("1", "Mats", 30000, dDK);
	Anstalld aDK2 = new Anstalld("2", "Viktoria", 35000, dDK);
	Anstalld aSWE1 = new Anstalld("3", "Anders", 40000, dSWE);
	dDK.addAnstalld(aDK1);
	dDK.addAnstalld(aDK2);
	dSWE.addAnstalld(aSWE1);
	
	
	System.out.println(mB.getNamn().toUpperCase() + "\r");
	
	for(Dotterbolag dotterbolag : mB.getDotterbolagList()) {
		if(dotterbolag.getNamn() != null) {
			System.out.println(dotterbolag.getNamn());
			for(Anstalld anstalld : dotterbolag.getAnstalldList()) {
				if(anstalld.getPnr() != null) {
					System.out.println("- " + anstalld.getNamn());
				}
			}
		}
	}
	System.out.println(mB.totalSalary());
	}
}
