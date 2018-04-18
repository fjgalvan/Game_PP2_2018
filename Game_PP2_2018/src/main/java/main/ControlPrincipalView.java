package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.PrincipalView;

public class ControlPrincipalView implements ActionListener{
	private PrincipalView principalView;
	
	public ControlPrincipalView(){
		principalView = new PrincipalView();
		this.principalView.getBtnPlay().addActionListener(this);
		this.principalView.getBtnConfiguration().addActionListener(this);
		this.principalView.getBtnAccept().addActionListener(this);
	}
	
	public void iniciar(){
		this.principalView.getFrmPrincipalView().setVisible(true);
		this.principalView.getPrincipalMain().setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == this.principalView.getBtnConfiguration()){
			this.principalView.getConfigurationPanel().setVisible(true);
			//Configuracion de teclas
		}
		if(e.getSource() == this.principalView.getBtnAccept()){
			this.principalView.getConfigurationPanel().setVisible(false);			
			//guardar informacion de la configuracion
		}
		if(e.getSource() == this.principalView.getBtnPlay()){
			this.principalView.getFrmPrincipalView().dispose();
			Juego juego = new Juego();
			juego.iniciar();
		}
	}
}
