
package modelo;

/**
 *
 * @author AULAFISI
 */
public class Alumno {
    String codigo;
    String nombre;
    String condicion;
    float ponderado;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.condicion="REGULAR";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public float getPonderado() {
        return ponderado;
    }

    public void setPonderado(float ponderado) {
        this.ponderado = ponderado;
    }
    
   public boolean marcarAsistencia (boolean asistencia){
       
       boolean resultado = false;
       return resultado;
   }
    
    
    
    
    
    
}
