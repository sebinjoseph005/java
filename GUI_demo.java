package java1;

import javax.swing.JOptionPane;

public class GUI_demo {
		public static void main(String[]args) {
			
			String name=JOptionPane.showInputDialog("enter you name");
			JOptionPane.showMessageDialog(null,"Hello:" +name);
			
			int age=Integer.parseInt(JOptionPane.showInputDialog("what is your age"));
			JOptionPane.showMessageDialog(null,"you are" +age+" years old");
			
			double weight=Integer.parseInt(JOptionPane.showInputDialog("what is your weight(in kilos)"));
			JOptionPane.showMessageDialog(null,"you are " +weight+" killos");
			
			
		}	
}
