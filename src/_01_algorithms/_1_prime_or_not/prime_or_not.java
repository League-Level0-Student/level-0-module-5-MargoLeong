package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"This ''game'' will tell you wther your number is prime or composite. Or neither");
		String prime = JOptionPane.showInputDialog(null, "enter a number here (1-10)");

	if(prime.equalsIgnoreCase("1")) {
		JOptionPane.showMessageDialog(null, "your number is not a prime or composite number. It is ''special''");
	}
	
	if(prime.equalsIgnoreCase("2")) {
		JOptionPane.showMessageDialog(null, "your number is prime");
	}
	if(prime.equalsIgnoreCase("3")) {
		JOptionPane.showMessageDialog(null, "your number is prime");
	}
	if(prime.equalsIgnoreCase("4")) {
		JOptionPane.showMessageDialog(null, "your number is composite");
	}
	if(prime.equalsIgnoreCase("5")) {
		JOptionPane.showMessageDialog(null, "your number is prime");
	}
	if(prime.equalsIgnoreCase("6")) {
		JOptionPane.showMessageDialog(null, "your number is composite");
	}
	if(prime.equalsIgnoreCase("7")) {
		JOptionPane.showMessageDialog(null, "your number is prime");
	}
	if(prime.equalsIgnoreCase("8")) {
		JOptionPane.showMessageDialog(null, "your number is composite");
	}
	if(prime.equalsIgnoreCase("9")) {
		JOptionPane.showMessageDialog(null, "your number is composite");
	}
	if(prime.equalsIgnoreCase("10")) {
		JOptionPane.showMessageDialog(null, "your number is composite");
	}else{
		JOptionPane.showMessageDialog(null, "your number is either not a whole number or a number higher than 10 or lower than 1");
	}
	
	
	
	
	
	
	}
	
}

