package org.computer;

public class PC extends Laptop {
	public void getSystemInfo() {
		System.out.println("The PC is working in iOS");
	}

	public static void main(String[] args) {
		PC pc = new PC();
		pc.getSystemInfo();
	}
}
