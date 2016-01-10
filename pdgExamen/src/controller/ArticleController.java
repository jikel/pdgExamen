package controller;

import java.util.List;

import javax.swing.JList;

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
	
	public List getListDB(){
		return Facade.getFacade().getListDb();
	}
	
	public void setListDb (int btnMenu){
		Facade.getFacade().setListDb(btnMenu);
	}
	
}
