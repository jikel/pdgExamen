package model;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class TestCollection extends JFrame{
	public TestCollection() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Test sur les Jtable");
		this.setSize(800,600);
		Facade fac = new Facade();
		List<Article> articles;
		articles = fac.getListeArticles(Article.Groupe.PLAT, null);
//		String[] truc = {"machin", "bidule", "truc"};
		
		JList liste = new JList (articles.toArray());

		
		this.getContentPane().add(new JScrollPane(liste));
		this.setVisible(true);
	}

	public static void main(String[] args) {
//		Facade fac = new Facade();
//		List<Article> articles;
//		articles = fac.getListeArticles(Article.Groupe.PLAT, null);
//		System.out.println(articles.toString());
		TestCollection test = new TestCollection();
		
	}

}
