package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.ArticleController;
import model.Article;
import model.Facade;

public class ArticleView extends JFrame implements Observer {

	// Les attributs
	private JPanel container = new JPanel();
	private ArticleController controller;

	private JPanel orderDetails = new JPanel();
	private JLabel numTable = new JLabel();
	private JLabel numOrder = new JLabel();

	private JPanel articleType = new JPanel();

	private JPanel articleTable = new JPanel();
	private JScrollPane articleDB = new JScrollPane();
	private JScrollPane articleOrder = new JScrollPane();
	private List <Article> articles = Facade.getFacade().getListeArticles(null, null);
	private JList listDB = new JList (articles.toArray());

	// Le constructeurt
	public ArticleView(ArticleController controller) {
		this.setTitle("Ajout article");
		this.setSize(1080, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		initGui();
		this.controller = controller;
		this.setContentPane(container);
		this.setVisible(true);
	}

	public void initGui() {

		container.setLayout(new BorderLayout());
		

		// Initialisation du panel des détails des commandes
		orderDetails.setLayout(new GridLayout(0, 5, 0, 0));
		// Première ligne
		orderDetails.add(new JLabel("N° de table:"));
		numTable.setText(Facade.getFacade().getNumTable());
		orderDetails.add(numTable);
		orderDetails.add(new JLabel(""));
		JButton btnConfirm = new JButton("Confirmer");
		btnConfirm.addActionListener(new ConfirmListener());
		orderDetails.add(btnConfirm);
		orderDetails.add(new JLabel(""));
		// Seconde ligne
		orderDetails.add(new JLabel("N° de commande"));
		numOrder.setText(Facade.getFacade().getNumOrder());
		orderDetails.add(numOrder);
		orderDetails.add(new JLabel(""));
		JButton btnCancel = new JButton("Annuler");
		btnCancel.addActionListener(new CancelListener());
		orderDetails.add(btnCancel);
		orderDetails.add(new JLabel(""));
		// Positionnement du JPanel orderDetails au "nord" du JPanel principal
		container.add(orderDetails, BorderLayout.NORTH);

		// Initialisation du panel des boutons des catégories
		JButton starter = new JButton("Entrée");
		starter.addActionListener(new StarterListener());
		articleType.add(starter);
		JButton mainDish = new JButton("Plat principal");
		mainDish.addActionListener(new MainDishListener());
		articleType.add(mainDish);
		JButton dessert = new JButton("Dessert");
		dessert.addActionListener(new DessertListener());
		articleType.add(dessert);
		JButton drink = new JButton("Boisson");
		drink.addActionListener(new DrinkListener());
		articleType.add(drink);
		JButton sauce = new JButton("Sauce");
		sauce.addActionListener(new SauceListener());
		articleType.add(sauce);
		// Positionnement du JPanel articleType au "centre" du JPanel principal
		container.add(articleType, BorderLayout.CENTER);

		// Initialisation du panel des articles
		this.articleDB = new JScrollPane(listDB);
		articleTable.add(articleDB);
		container.add(articleTable, BorderLayout.SOUTH);
		
		// Organisation du BoxLayout du JPanel principal
//		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
//		container.add(orderDetails);
//		container.add(articleType);
//		container.add(articleTable);
	}
	
	// Class des "listeners" des boutons
	class ConfirmListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
		System.out.println("Confirmation");
		}
	}
	
	class CancelListener implements ActionListener {
		public void actionPerformed (ActionEvent e){
			System.out.println("Annulation");
		}
	}
	
	class StarterListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			controller.setListDb(1);
		}
	}
	class MainDishListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			controller.setListDb(2);
		}
	}
	class DessertListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			controller.setListDb(3);
		}
	}
	class DrinkListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			controller.setListDb(4);
		}
	}
	class SauceListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			controller.setListDb(5);
		}
	}
	@Override
	public void update(Observable o, Object arg) {

		listDB.setListData(this.controller.getListDB().toArray());

	}

}
