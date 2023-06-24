package app;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import controlador.ControladorLogin;
import vista.frmIngreso;

public class App {
    public static void main(String[] args) {
      UsuarioArreglo usuarios = new UsuarioArreglo(10);
      frmIngreso fIngreso = new frmIngreso();        
      
      datos.Datos.usuarios.agregar(new Usuario("Sofia Seminario", "22200111", "sofia.seminario", "miau"));
      datos.Datos.usuarios.agregar(new Usuario("Paolo Flores", "22200084", "paoloose", "miau"));
      datos.Datos.usuarios.agregar(new Usuario("Harumi Contreras", "22200234", "harumic", "holabenja"));
      datos.Datos.usuarios.agregar(new Usuario("Rodro Alva", "22200137", "taladrobauer", "hola"));
      datos.Datos.usuarios.agregar(new Usuario("Gabriel Amogus", "22200101", "amogus", "sus101"));
      datos.Datos.usuarios.agregar(new Usuario("Angela Jara", "22200288", "ajara", "owo"));
      ControladorLogin control = new ControladorLogin(usuarios, fIngreso);
      control.iniciar();     
        
        
        
    }
    
}
