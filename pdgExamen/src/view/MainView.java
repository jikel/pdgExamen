package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.AbstractController;

public class MainView extends JFrame implements Observer{

	private JPanel container = new JPanel();
	
	private AbstractController controler;
	
	public public MainView(AbstractController controler) {
		this.controler = controler;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
