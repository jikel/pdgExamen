package controller;

import java.util.List;

import javax.swing.JList;

import model.Article;
import model.Facade;
import view.ArticleView;

public class ArticleController {

	private ArticleView av;

	public ArticleController() {
		av = new ArticleView(this);
		Facade.getFacade().addObserver(av);
	}

	public void setNumTable(String numTable) {
		Facade.getFacade().setNumTable(numTable);
	}

	public String getNumTable() {
		return Facade.getFacade().getNumTable();
	}

	public String getNumOrder() {
		return Facade.getFacade().getNumOrder();
	}

	public List getListDB() {
		return Facade.getFacade().getListDb();
	}

	public void setListDb(int btnMenu) {
		Facade.getFacade().setListDb(btnMenu);
	}

	public Article getArticleDbSelected() {
		return Facade.getFacade().getArticleDbSelected();
	}

	public void setArticleDbSelected(Article articleSelected) {
		Facade.getFacade().setArticleDbSelected(articleSelected);
	}

	public List getListOrder() {
		return null;
	}

	public void setListOrder() {

	}
	
	public Article getArticleOrderSelected() {
		return Facade.getFacade().getArticleOrderSelected();
	}

	public void setArticleOrderSelected(Article articleSelected) {
		Facade.getFacade().setArticleOrderSelected(articleSelected);
	}

}
