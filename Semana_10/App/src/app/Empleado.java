package app;

public class Empleado extends Persona {
    protected String codigo;
    protected float sueldo;
    
    public Empleado (String nombres, String apellidos, String documento, String codigo, float sueldo){
        super (nombres, apellidos, documento);
        this.codigo = codigo;
        this.sueldo = sueldo;    
    }

    public String getCodigo() {
        return codigo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
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
    
    
    
}
