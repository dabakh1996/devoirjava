package entites;

import java.util.List;

public class Permanant extends Professeur {
private Integer salaire;

public Permanant() {
	super();
}

public Permanant(String nom, String prenom, String tel, String code, List<Matiere> matiere, Integer salaire) {
	super(nom, prenom, tel, code, matiere);
	this.salaire = salaire;
}

public Integer getSalaire() {
	return salaire;
}

public void setSalaire(Integer salaire) {
	this.salaire = salaire;
}

}
