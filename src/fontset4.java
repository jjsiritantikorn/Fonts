import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class fontset4 {

	
	public static void main(String[] args) {

        
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
    	  String [] names = ge.getAvailableFontFamilyNames();
    	  	  
 
    	  
    	  //Font box
    	  
    	  final JComboBox fontselect = new JComboBox( );
    	 
    	  for ( int i=0; i<names.length; i++ )
          {
              fontselect.addItem( names[i] );
          }
    	  fontselect.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		

		//Style box
    	  
		final JComboBox styleselect = new JComboBox();
	    styleselect.addItem("Plain");
	    styleselect.addItem("Bold");
	    styleselect.addItem("Italics");
	    styleselect.addItem("Bold and Italics");
	    styleselect.setAlignmentX(Component.CENTER_ALIGNMENT);
	    

	    
	    
	    //Size box
	    
	    final JComboBox sizeselect = new JComboBox();

	    for ( int i = 6; i < 40; i+=2){
	    	
	    	sizeselect.addItem(i);   	
	    }
	    sizeselect.setSelectedItem(12);


	    //Color box
	    final JComboBox colorselect = new JComboBox();
	    
	    colorselect.addItem("Change text color");
	    colorselect.addItem("Black");
	    colorselect.addItem("Blue");
	    colorselect.addItem("Dark Grey");
	    colorselect.addItem("Grey");
	    colorselect.addItem("Green");
	    colorselect.addItem("Yellow");
	    colorselect.addItem("Light Grey");
	    colorselect.addItem("Magenta");
	    colorselect.addItem("Orange");
	    colorselect.addItem("Pink");
	    colorselect.addItem("Red");
	    colorselect.addItem("White");
	    colorselect.setSelectedIndex(0);
	    
 final JComboBox backcolorselect = new JComboBox();
	    
	    backcolorselect.addItem("Change background color");
	    backcolorselect.addItem("Black");
	    backcolorselect.addItem("Blue");
	    backcolorselect.addItem("Dark Grey");
	    backcolorselect.addItem("Grey");
	    backcolorselect.addItem("Green");
	    backcolorselect.addItem("Yellow");
	    backcolorselect.addItem("Light Grey");
	    backcolorselect.addItem("Magenta");
	    backcolorselect.addItem("Orange");
	    backcolorselect.addItem("Pink");
	    backcolorselect.addItem("Red");
	    backcolorselect.addItem("White");
	    backcolorselect.setSelectedIndex(0);
	    
	    //Sample text area
	    final TextArea sample = new TextArea();
	    sample.setEditable(false);
	    
	    
	    
	  
	    
	    //Add text to area
	    sample.append("The quick brown fox jumped over the lazy dog’s back");
	    sample.append("\n");
	    sample.append("Pack my box with five dozen liquor jugs.");
	    sample.append("\n");
	    sample.append("Jackdaws love my big sphinx of quartz.");
	    sample.append("\n");
	    sample.append("Mr.Jock, TV quiz PhD, bags few lynx");
	    sample.append("\n");
	    sample.append("abcdefghijklmnopqrstuvwxyz");
	    sample.append("\n");
	    sample.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	    sample.append("\n");
	    sample.append("0123456789");
	    sample.append("\n");
	    sample.append("€†™´¸¢©¤°÷½¼¾>¡¿«‘’<¯µ ·¬ªº¶±£" +""+ "»®§­¹²³ß×™¨¥");
	    sample.append("\n");
	    sample.append("ÀÁÂÃÄÅÆÇÈÉ ÊËÌÍÎÏÐÑÒÓÔ ÕÖØÙÚÛÜÝÞÿ");
	    sample.append("\n");
	    sample.append("àáâãäåæçèé êëìíîïðñòóô õöøùúûüýþÿ");
	    sample.append("\n");
	    sample.append("!#$%&'()*+,-./:;<=>?@[^_z{|}~");
	    sample.append("\n");
	    sample.append("uvw wW gq9 2z 5s il17|!j oO08 `' ;:,. m nn rn {[()]}u)");
	    
	    
	    //Result button
	    
	    
	    JButton seeresult = new JButton("See font");
	    
	    seeresult.addActionListener(new ActionListener() {
	    	 
            public void actionPerformed(ActionEvent e)
            {

            	Object x = fontselect.getSelectedItem();
            	String fontfont = (String) x;
            	
            	Object y = styleselect.getSelectedIndex();
            	int style = (Integer) y;
            	int fontstyle = 0;
            	
            	if (style == 0) {
            		fontstyle = Font.PLAIN;
            	}
            	
            	if (style == 1) {
            		fontstyle = Font.BOLD;
            	}
            	if (style == 2) {
            		fontstyle = Font.ITALIC;
            	}
            	if (style == 3) {
            		fontstyle = Font.BOLD + Font.ITALIC;
            	}
            	

            	
            	
        	    Object z = sizeselect.getSelectedItem();
        	    int fontsize = (Integer) z;
        	    
        	    Color fontcolor = null;
        	    int w = colorselect.getSelectedIndex();
        	    if (w == 1) {
            		fontcolor = Color.BLACK;
        	    }  
        	    if (w == 2) {
            		fontcolor = Color.BLUE;
        	    }
        	    if (w == 3) {
            		fontcolor = Color.darkGray;
        	    }
        	    if (w == 4) {
            		fontcolor = Color.gray;
        	    }
        	    if (w == 5) {
            		fontcolor = Color.GREEN;
        	    }
        	    if (w == 6) {
            		fontcolor = Color.YELLOW;
        	    }
        	    if (w == 7) {
            		fontcolor = Color.lightGray;
        	    }
        	    if (w == 8) {
            		fontcolor = Color.MAGENTA;
        	    }
        	    if (w == 9) {
            		fontcolor = Color.ORANGE;
        	    }
        	    if (w == 10) {
            		fontcolor = Color.PINK;
        	    }
        	    if (w == 11) {
            		fontcolor = Color.RED;
        	    }
        	    if (w == 12) {
            		fontcolor = Color.WHITE;
        	    }
        	    
        	    
        	    Color backcolor = null;
        	    int c = backcolorselect.getSelectedIndex();
        	    if (c == 1) {
            		backcolor = Color.BLACK;
        	    }  
        	    if (c == 2) {
        	    	backcolor = Color.BLUE;
        	    }
        	    if (c == 3) {
        	    	backcolor = Color.darkGray;
        	    }
        	    if (c == 4) {
        	    	backcolor = Color.gray;
        	    }
        	    if (c == 5) {
        	    	backcolor = Color.GREEN;
        	    }
        	    if (c == 6) {
        	    	backcolor = Color.YELLOW;
        	    }
        	    if (c == 7) {
        	    	backcolor = Color.lightGray;
        	    }
        	    if (c == 8) {
        	    	backcolor = Color.MAGENTA;
        	    }
        	    if (c == 9) {
        	    	backcolor = Color.ORANGE;
        	    }
        	    if (c == 10) {
        	    	backcolor = Color.PINK;
        	    }
        	    if (c == 11) {
        	    	backcolor = Color.RED;
        	    }
        	    if (c == 12) {
        	    	backcolor = Color.WHITE;
        	    }
        	    
        	    
            	Font font = new Font (fontfont, fontstyle , fontsize);
        	    sample.setFont(font);
        	    sample.setForeground(fontcolor);
        	    sample.setBackground(backcolor);
       

            }

			
	
			


        });  

	    

        JFrame frame = new JFrame("FontDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.add(fontselect);
        frame.add(styleselect);
        frame.add(sizeselect);
        frame.add(colorselect);
        frame.add(backcolorselect);
        frame.add(seeresult);
        frame.add(sample);

        
 
        //Display the window.
        frame.setVisible(true);
        frame.pack();
    }
}