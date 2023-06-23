
package modelo;

/**
 *
 * @author AULAFISI
 */
public class NotaTipo {
    String nombre;
    float peso;
    boolean activo;

    public NotaTipo(String nombre, float peso, boolean activo) {
        this.nombre = nombre;
        this.peso = peso;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void habilitar(){
        this.activo = true;
    }
    
    public void deshabilitar(){
        this.activo = false;
    }    

    @Override
    public String toString() {
        return "notaTipo{" + "nombre=" + nombre + ", peso=" + peso + ", activo=" + activo + '}';
    }
    
    
    
}
