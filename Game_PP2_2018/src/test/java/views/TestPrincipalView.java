package views;

import org.junit.Test;

public class TestPrincipalView {
	@Test
	public void testPrincipalView(){
		PrincipalView view= new PrincipalView();
		view.getBtnAccept();
		view.getBtnConfiguration();
		view.getBtnPlay();
		view.getConfigurationPanel();
		view.getFrmPrincipalView();
		view.getPrincipalMain();
		view.getTextFieldDown();
		view.getTextFieldLeft();
		view.getTextFieldRight();
		view.getTextFieldUp();
	}
}
