package entites;

public class Personne {
	protected String nom;
	protected String prenom;
	protected String tel;
	public Personne() {

	}
	public Personne(String nom, String prenom, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}



}
