package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import vista.frmIngreso; 
        
public class ControladorLogin {
    UsuarioArreglo modelo;
    frmIngreso vista;
    
    

    public ControladorLogin(UsuarioArreglo modelo, frmIngreso vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.txtUsuario.getText();
                String  clave = vista.txtClave.getText();
                Usuario user = modelo.validar(usuario, clave);
                
                if (user !=null){
                  JOptionPane.showMessageDialog(vista, "Bienvenido(a), "+user.getNombre()+".");
                }else{
                  JOptionPane.showMessageDialog(vista, "Entrada Invalida.");
                }                
                limpiarControles();               
            }
        });
        
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }
    
    public void limpiarControles(){
        vista.txtClave.setText("");
        vista.txtUsuario.setText("");
    
    }
    
}
