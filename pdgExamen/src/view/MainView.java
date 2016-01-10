package view;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MainController;

public class MainView extends JFrame implements Observer{

	private JPanel container = new JPanel();
	   
	  String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
	  JButton[] tab_button = new JButton[tab_string.length];
	   
	  private JLabel ecran = new JLabel();
	  private Dimension dim = new Dimension(50, 40);
	  private Dimension dim2 = new Dimension(50, 31);
	  private double chiffre1;
	  private boolean clicOperateur = false, update = false;
	  private String operateur = "";
	   
	  //L'instance de notre objet contrôleur
	  private MainController controller;

	  public MainView(MainController controller){                
	    this.setSize(240, 260);
	    this.setTitle("Calculette");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    initComponent();
	    this.controller = controller;                
	    this.setContentPane(container);
	    this.setVisible(true);
	  }
	
	  public void initComponent(){
		  
	  }
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
