package controller;

import java.util.ArrayList;

import model.AbstractModel;

public class AbstractController {
	protected AbstractModel calc;
	protected String operateur = "", nbre = "";
	protected ArrayList<String> listOperateur = new ArrayList<String>();

	public AbstractController(AbstractModel cal) {
		this.calc = cal;
		// On définit la liste des opérateurs
		// Afin de s'assurer qu'ils sont corrects
		this.listOperateur.add("+");
		this.listOperateur.add("-");
		this.listOperateur.add("*");
		this.listOperateur.add("/");
		this.listOperateur.add("=");
	}

	// Définit l'opérateur
	public void setOperateur(String ope) {
		this.operateur = ope;
	//	control();
	}

	// Définit le nombre
	public void setNombre(String nombre) {
		this.nbre = nombre;
	}

	// Efface
	public void reset() {
		this.calc.reset();
	}

	// Méthode de contrôle
}