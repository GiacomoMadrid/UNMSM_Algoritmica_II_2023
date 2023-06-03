package app;


public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String documento;

    public Persona(String nombres, String apellidos, String documento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
      
    
    
    
    
}
