package de.jonas.philosophen;

public class Philosoph {
	String name;
	int pos;
	boolean hungrig;
	Gabel linkeGabel;
	Gabel rechteGabel;
	
	public Philosoph(String pname, int ppos) {
		this.name = pname;
		this.pos = ppos;
	}

}
