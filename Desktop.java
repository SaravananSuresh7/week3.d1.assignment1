package org.system;

public class Desktop {
	public void DesktopSize() {
		System.out.println("My desktop screen size is 32 inches");
	}
	public static void main(String[] args) {
		Computer comp = new Computer();
		Desktop Desk = new Desktop();
		
		comp.ComputerModel();
		Desk.DesktopSize();
	}
	
}
