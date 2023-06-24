
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Usuario;
import vista.frmIngreso;
import vista.frmPrincipal;

public class ControladorPrincipal {
        Usuario modelo;
        frmPrincipal vista; 
        
    public ControladorPrincipal(Usuario modelo, frmPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.lblUsuario.setText("Usuario: "+modelo.getNombre());
       
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmIngreso fIngreso = new frmIngreso();
                ControladorLogin cotrolador = new ControladorLogin(configuracion.Datos.usuarios, fIngreso());
            }
        
    }
    
    
    
    
}
