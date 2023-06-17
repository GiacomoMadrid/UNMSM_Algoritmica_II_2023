
package modelo;

public class Usuario {
   private String nombre;
   private String dni;
   private Login log;
   
   public Usuario(String nombre, String dni, String usuario, String clave){
       this.nombre = nombre;
       this.dni = dni;
       this.log = new Login(usuario, clave);   
   }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Login getLog() {
        return log;
    }

    public void setLog(Login log) {
        this.log = log;
    }
   
    public boolean validar(String usuario, String clave){
        return this.log.validar(usuario, clave);
    }
   
    
    
}
