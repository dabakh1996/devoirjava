package entites;

public class Note {
	private Integer idN;
	private double valeur;
	private Matiere matiere;
	private String semestre;
	private Integer annee;
	public Note() {

	}
	public Note(Integer idN, Matiere matiere, String semestre, Integer annee) {
		this.idN = idN;
		this.matiere = matiere;
		this.semestre = semestre;
		this.annee = annee;
	}
	public Integer getIdN() {
		return idN;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	public void setIdN(Integer idN) {
		this.idN = idN;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}




}
