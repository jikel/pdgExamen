package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.ArticleController;

public class ArticleView extends JFrame implements Observer {

	// Les attributs
	private JPanel container = new JPanel();
	private ArticleController controler;

	private JPanel orderDetails = new JPanel();
	private JLabel numTable = new JLabel();
	private JLabel numOrder = new JLabel();

	private JPanel articleType = new JPanel();

	private JPanel articleTable = new JPanel();
	private JScrollPane articleDB = new JScrollPane();
	private JScrollPane articleOrder = new JScrollPane();
	private JTable table ;
	private String titleTable[]= {"Nom", "Prix", ""};
	private Object[][] data ={
			{"Coca", "2,50 €", new JButton("ajouter")},
			{"Coca zéro", "2,50 €", new JButton("ajouter")},
			{"Fanta", "2,50 €", new JButton("ajouter")},
			{"Sprite", "2,50 €", new JButton("ajouter")},
			{"Minute maid", "3,50 €", new JButton("ajouter")},
			{"Nestea", "3,00 €", new JButton("ajouter")}
	};

	// Le constructeurt
	public ArticleView(ArticleController controler) {
		this.setTitle("Ajout article");
		this.setSize(1080, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		initGui();
		this.controler = controler;
		this.setContentPane(container);
		this.setVisible(true);
	}

	public void initGui() {

		container.setLayout(new BorderLayout());
		

		// Initialisation du panel des détails des commandes
		orderDetails.setLayout(new GridLayout(0, 5, 0, 0));
		// Première ligne
		orderDetails.add(new JLabel("N° de table:"));
		orderDetails.add(numTable);
		orderDetails.add(new JLabel(""));
		JButton btnConfirm = new JButton("Confirmer");
		btnConfirm.addActionListener(new ConfirmListener());
		orderDetails.add(btnConfirm);
		orderDetails.add(new JLabel(""));
		// Seconde ligne
		orderDetails.add(new JLabel("N° de commande"));
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
		// Positionnement du JPanel articleType au "centre" du JPanel principal
		container.add(articleType, BorderLayout.CENTER);

		// Initialisation du panel des articles
		this.table = new JTable(data, titleTable);
		this.table.setDefaultRenderer(JComponent.class, new TableComponent());
		this.table.getColumn("").setCellRenderer(new ButtonRenderer());
		articleTable.setSize(800, 800);
		articleTable.add(table);
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
			System.out.println("Entrée");
		}
	}
	class MainDishListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			System.out.println("Plat principal");
		}
	}
	class DessertListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			System.out.println("Dessert");
		}
	}
	class DrinkListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			System.out.println("Boisson");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
