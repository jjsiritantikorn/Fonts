
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
	
public class jcolortext {
	  public static void main(String[] args) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("JTextArea Test");
	    frame.setLayout(new FlowLayout());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    String text = "The quick brown fox jumped over the lazy dog’s back."
	        + "Pack my box with five dozen liquor jugs."
	        + "Jackdaws love my big sphinx of quartz."
	        + "Mr. Jock, TV quiz PhD, bags few lynx."
	        + "abcdefghijklmnopqrstuvwxyz"
	        + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	        + "01234567890";
	  
	    JTextArea textAreal = new JTextArea(text, 100, 100);
	    textAreal.setPreferredSize(new Dimension(100, 100));
	    JTextArea textArea2 = new JTextArea(text, 5, 10);
	    textArea2.setPreferredSize(new Dimension(100, 100));
	    JScrollPane scrollPane = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    textAreal.setLineWrap(true);
	    textArea2.setLineWrap(true);
	    frame.add(textAreal);
	    frame.add(scrollPane);
	    frame.pack();
	    frame.setVisible(true);
	  }
}