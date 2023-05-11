
package modelo;

/**
 *
 * @author AULAFISI
 */
public class Curso {
    String codigo;
    String nombre;
    int num_sesiones;
    Docente docente;
    Matricula matriculas[];
    int ind_matriculas;
    Session sessions[];
    int ind_sessions;
    
    public Curso(String codigo, String nombre, int num_sesiones, Docente docente){
        this.codigo = codigo;
        this.nombre = nombre;
        this.num_sesiones = num_sesiones;
        this.docente = docente;
        this.ind_matriculas = 0;
        this.ind_sesiones = 0;
    }
    
    public void agregarMatricula(Matricula matricula){
        this.matriculas[this.ind_sesiones] = matricula;
        this.ind_sesiones++;
    }
    
    public Matricula buscarMatricula(Alumno alumno){
        for(int i=0; i<ind_matriculas; i++){
            if(matriculas[i].getMatricula() == alumno){
                return matriculas[i];
            }
        }
        return null;
    }
    
    public bool agregarSession(Session session){
        if(ind_sesiones < num_sesiones){ // Limitado al numero de sesiones
            this.matriculas[this.ind_sessions] = session;
            this.ind_sessions++;
            return true;
        } else {
            return false; // No se puede agregar
        }
    }
    
    public Session buscarSession(int numero){
        for(int i=0; i<ind_sessions; i++){
            if(sessions[i].getNumero() == numero){
                return sessions[i];
            }
        }
        return null;
    }
    
    public Asistencia[] buscarAsistencia(Alumno alumno){
        Asistencia asistencias[];
        int ind_asistencias = 0;
        for(int i=0; i<ind_sessions; i++){
            for(int j=0; j<sessions[i].getIndice(); j++){
                if(sessions[i].getAsistencias()[j].getMatricula().getAlumno().getCodigo() == alumno.getCodigo()){
                    asistencias[ind_asistencias] = sessions[i].getAsistencias()[j]
                    ind_asistencias++;
                }
            }
        }
        return asistencias;
    }
    
    public float calcularPorcentajeAsistencia(Alumno alumno){
        int contador = 0;
        Asistencia asistencias[] = buscarAsistencia(Alumno alumno);
        for(int i=0; i<asistencias.length; i++){
            if(asistencias[i].getEstado() == true){
                contador++;
            }
        }
        return 100*contador/(asistencias.length+0.0)
    }
}
