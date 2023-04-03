package javaapplication5;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author AULAFISI
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //base
        Scanner jin = new Scanner(System.in);
        
        //variables:
        String confirmacion;
        
        System.out.println("Hola, esto es una prueba para ver si de algo sirvieron las clases de ATS :3");
        System.out.println("Miau, escriba cualquier cosa para confirmar los datos de entrada.");
        confirmacion=jin.nextLine();
        System.out.println("Dato de entrada: "+confirmacion);
        
        JOptionPane.showMessageDialog(null, "Bien, probemos la entrada por ventanita.");
        confirmacion= JOptionPane.showInputDialog("Escriba Miau para confirmar.");
        JOptionPane.showMessageDialog(null,confirmacion);
        
        
        
    }
    
}
