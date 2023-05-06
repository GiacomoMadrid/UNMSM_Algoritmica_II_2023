
package modelo;

/**
 *
 * @author AULAFISI
 */
public class Nota {
  
    private float nota;
    private NotaTipo tipo;

    public Nota(float nota, NotaTipo tipo) {
        this.nota = nota;
        this.tipo = tipo;
    }

    public float getNota() {
        return nota;
    }

    public NotaTipo getTipo() {
        return tipo;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    
    
    
}
