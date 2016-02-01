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
 
public class fontset5 {

	
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


	    

	    
	    //Sample text area
	    final TextArea sample = new TextArea();
	    sample.setEditable(false);
	    
	    JButton fontcolorselect = new JButton("Select font color");
	    
	    fontcolorselect.addActionListener(new ActionListener() {
	    	 
            public void actionPerformed(ActionEvent e)
            {
            	Color a = JColorChooser.showDialog(null, "Choose a Color", sample.getForeground());
                if (a != null)
                  sample.setForeground(a);
            }
	    });
            
         JButton backgroundcolorselect = new JButton("Select background color");
        	    
         backgroundcolorselect.addActionListener(new ActionListener() {
        	    	 
          public void actionPerformed(ActionEvent e)
          {
           Color b = JColorChooser.showDialog(null, "Choose a Color", sample.getBackground());
           if (b != null)
           sample.setBackground(b);
          }
          });
	  
	    
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
	    
	    Font defaultfont = new Font("Abadi MT Condensed Extra Bold", Font.PLAIN, 12);
	    sample.setFont(defaultfont);
	    
	    
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
        	    
        	    
        	    
        	    
        	   
        	    
        	    
            	Font font = new Font (fontfont, fontstyle , fontsize);
        	    sample.setFont(font);

       

            }

			
	
			


        });  

	    

        JFrame frame = new JFrame("FontDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.add(fontselect);
        frame.add(styleselect);
        frame.add(sizeselect);
        frame.add(fontcolorselect);
        frame.add(backgroundcolorselect);
        frame.add(seeresult);
        frame.add(sample);

        
 
        //Display the window.
        frame.setVisible(true);
        frame.pack();
    }

            
	    }
	