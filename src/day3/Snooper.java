package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String Snooper=JOptionPane.showInputDialog("Where do you live?");
	JOptionPane.showMessageDialog(null, "You live at"+Snooper);
	String Age=JOptionPane.showInputDialog("How old are you?");
	JOptionPane.showMessageDialog(null, "You are..."+Age );
	String Place=JOptionPane.showInputDialog("Where do your parents keep their money?");
	JOptionPane.showMessageDialog(null, "Your parents keep your money in the"+Place);
	JOptionPane.showMessageDialog(null, "Aw, I was thinking of robbing your family!");
	
}
}
