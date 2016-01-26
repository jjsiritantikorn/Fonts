import java.awt.GraphicsEnvironment;

public class Test
{
   public static void main ( String [] args )
      {
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      for ( int i=0; i<names.length; i++ )
         {
             System.out.println( names[i] );
         }
      }
}
