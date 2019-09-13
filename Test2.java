/*
Ett enkelt Hello World i java
Skapat 2019-09-13
Programmerare Anton Jonsson
*/
import javax.swing.*;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// variabledeklaration
		String msg;
		// tilldelning
		msg = "nu har variabeln ett värde";
		// initiering
		int tal = 17;
		//dialogruta
		msg = JOptionPane.showInputDialog(null, "Skriv ett medelande");
		JOptionPane.showMessageDialog(null, msg);
		// I terminalen
		System.out.println("Skriv ett medelande");
		Scanner tgb = new Scanner(System.in);
		msg = tgb.nextLine();
		System.out.println(msg);
	}
}