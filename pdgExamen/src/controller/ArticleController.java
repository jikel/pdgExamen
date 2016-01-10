package controller;

import model.Facade;
import view.ArticleView;

public class ArticleController {
	
	private ArticleView av;
	
	public ArticleController () {
		av = new ArticleView(this);
		Facade.getFacade().addObserver(av);
	}

	public void setNumTable (String numTable){
		Facade.getFacade().setNumTable(numTable);
	}
	
	public String getNumTable (){
		return Facade.getFacade().getNumTable();
	}
	
	public String getNumOrder(){
		return Facade.getFacade().getNumOrder();
	}
}
