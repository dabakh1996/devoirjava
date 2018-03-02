package entites;

import java.util.List;

public class Vacataire extends Professeur {
private Integer tauxhoraire;
private Integer nbheure;
public Vacataire() {
	super();
}
public Vacataire(String nom, String prenom, String tel, String code, List<Matiere> matiere, Integer tauxhoraire,
		Integer nbheure) {
	super(nom, prenom, tel, code, matiere);
	this.tauxhoraire = tauxhoraire;
	this.nbheure = nbheure;
}
public Integer getTauxhoraire() {
	return tauxhoraire;
}
public void setTauxhoraire(Integer tauxhoraire) {
	this.tauxhoraire = tauxhoraire;
}
public Integer getNbheure() {
	return nbheure;
}
public void setNbheure(Integer nbheure) {
	this.nbheure = nbheure;
}

}
