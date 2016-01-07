package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Facade extends AbstractModel{
	
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();

	
	//Implémentation du pattern observer
	  public void addObserver(Observer obs) {
	    this.listObserver.add(obs);
	  }

	  public void notifyObserver(String str) {
	    if(str.matches("^0[0-9]+"))
	      str = str.substring(1, str.length());

	  }

	  public void removeObserver() {
	    listObserver = new ArrayList<Observer>();
	  }

	@Override
	public void addObserver(observer.Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getResultat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOperateur(String operateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNombre(String nbre) {
		// TODO Auto-generated method stub
		
	}  
}
