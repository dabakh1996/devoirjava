package entites;

import java.util.List;

public class Professeur extends Personne {
	protected String code;
	protected List<Matiere> matiere;
	public Professeur() {
		super();
	}
	public Professeur(String nom, String prenom, String tel, String code, List<Matiere> matiere) {
		super(nom, prenom, tel);
		this.code = code;
		this.matiere = matiere;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Matiere> getMatiere() {
		return matiere;
	}
	public void setMatiere(List<Matiere> matiere) {
		this.matiere = matiere;
	}


}
