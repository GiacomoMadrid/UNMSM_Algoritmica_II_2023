
package modelo;

/**
 *
 * @author AULAFISI
 */
public class Docente {
    String codigo;
    String notas;
    String tipo;
    
    //Métodos

    public Docente(String codigo, String notas, String tipo) {
        this.codigo = codigo;
        this.notas = notas;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Docente{" + "codigo=" + codigo + ", notas=" + notas + ", tipo=" + tipo + '}';
    }
        
    public boolean registrarNota(float nota, Matricula matricula){    
            boolean retorno = false;
            return retorno;
    }
    
    public boolean registrarAsistencia(Matricula matricula, boolean asistencia){
            boolean retorno = false;
            return retorno;
    
    }    
    
    
    
    
    
    
    
    
}
