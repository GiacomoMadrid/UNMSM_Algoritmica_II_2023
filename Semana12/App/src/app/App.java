package app;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import controlador.ControladorLogin;
import vista.frmIngreso;

public class App {
    public static void main(String[] args) {
      UsuarioArreglo usuarios = new UsuarioArreglo(10);
      frmIngreso fIngreso = new frmIngreso();        
      
      usuarios.agregar(new Usuario("Paolo Flores", "22200084", "paoloose", "miau"));
      usuarios.agregar(new Usuario("Harumi Contreras", "22200234", "harumic", "holabenja"));
      usuarios.agregar(new Usuario("Rodro Alva", "22200137", "taladrobauer", "hola"));
      usuarios.agregar(new Usuario("Gabriel Amogus", "22200101", "amogus", "sus101"));
      usuarios.agregar(new Usuario("Angela Jara", "22200288", "ajara", "owo"));
      ControladorLogin control = new ControladorLogin(usuarios, fIngreso);
      control.iniciar();     
        
        
        
    }
    
}
