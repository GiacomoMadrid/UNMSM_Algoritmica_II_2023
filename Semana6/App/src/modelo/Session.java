
package modelo;

import java.util.Date;

public class Session {
    private int numero;
    private Date fecha;
    private Asistencia asistencias[];
    private int indice;

    public Session(int numero, Date fecha, int num_matriculados) {
        this.numero = numero;
        this.fecha = fecha;
        this.asistencia = new Asistencia[num_matriculados];
        this.indice = 0;
    }

    public int getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public boolean agregarAsistencia(Asistencia asi){
        boolean retorno = false;
        for(short i=0; i<indice; i++){
            if(asistencias[i].getMatricula().getAlumno().getCodigo() == asi.getMatricula().getAlumno().getCodigo()){
                return false;
            }
        }
        asistencia[indice]=asi;
        indice++;
        retorno = true;
    }
    
    public Asistencia buscarAsistencia(Alumno alumno){
        for (short i=0; i<indice; i++){
            if(asistencias[i].getMatricula().getAlumno().getCodigo() == alumno.getCodigo()){
                return asistencias[i];
            }
        }        
    }
       
    
}
