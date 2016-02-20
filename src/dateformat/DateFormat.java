
package dateformat;
import javax.swing.JOptionPane;

public class DateFormat {

    
    public static void main(String[] args) {
    String s1= JOptionPane.showInputDialog("Enter the date in the format mm/dd/yy: ");
      String month = s1.substring(0,2);
      String day = s1.substring(3,5);
      String year = s1.substring(6);
      JOptionPane.showMessageDialog(null, 
              "In Europe it is " + day + "." + month + "." + year);
      System.exit(0);
      
    }
    
}
