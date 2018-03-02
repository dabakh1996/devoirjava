package entites;

import java.util.List;

public class Public extends Etudiant {
	private double bource;

	public Public() {
		super();
	}

	public Public(String nom, String prenom, String tel, Integer mat, List<Note> notes, double bource) {
		super(nom, prenom, tel, mat, notes);
		this.bource = bource;
	}

	public double getBource() {
		return bource;
	}

	public void setBource(double bource) {
		this.bource = bource;
	}

}
