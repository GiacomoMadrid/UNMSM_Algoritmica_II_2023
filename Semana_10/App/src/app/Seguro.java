package app;

public class Seguro {
    protected int numero;
    protected String nombre;
    protected float prima;
    protected double comision;
    protected double cobertura;
    protected Cliente cliente;
    protected Empleado empleado;

    public Seguro(int numero, String nombre, float prima, double comision, double cobertura) {
        this.numero = numero;
        this.nombre = nombre;
        this.prima = prima;
        this.comision = comision;
        this.cobertura = cobertura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrima() {
        return prima;
    }

    public void setPrima(float prima) {
        this.prima = prima;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    } 
    
    
    
    
    
    public boolean registrar(Cliente cliente, Empleado empleado, float prima, double comision, double cobertura){
        boolean flag = true;
        //comprobar si existe el cliente antes de hacer el registro para evitar doble registro.
        
        return flag;
    }    
    
}
