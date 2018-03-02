package entites;

import java.util.List;

public class Etudiant extends Personne{
	protected Integer mat;
	protected List<Note> notes;
	public Etudiant() {
		super();
	}
	public Etudiant(String nom, String prenom, String tel, Integer mat, List<Note> notes) {
		super(nom, prenom, tel);
		this.mat = mat;
		this.notes = notes;
	}
	public Integer getMat() {
		return mat;
	}
	public void setMat(Integer mat) {
		this.mat = mat;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
