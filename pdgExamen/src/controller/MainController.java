package controller;

import model.Facade;
import view.MainView;

public class MainController {

	private MainView mainView;
	private Facade fac;
	
	public MainController(Facade fac){
		this.fac = fac;
	}
	
}
