package entites;

import java.util.List;

public class Prive extends Etudiant{
	private double mensualite;

	public Prive() {
		super();
	}

	public Prive(String nom, String prenom, String tel, Integer mat, List<Note> notes, double mensualite) {
		super(nom, prenom, tel, mat, notes);
		this.mensualite = mensualite;
	}

	public double getMensualite() {
		return mensualite;
	}

	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}




}
