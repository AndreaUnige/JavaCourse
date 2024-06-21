package classes;

import interfaces.ILogin;

public class RunGUI implements ILogin {

	MyFrame frame = null;
	
	public RunGUI() {
		frame = new MyFrame(this);
		
	}
	
	@Override
	public void onLoginSuccesfull(boolean result) {
		frame = new MyFrame(this);
	}
	
	
}
