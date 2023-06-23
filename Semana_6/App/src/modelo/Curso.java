package modelo;

public class Curso {
    String codigo;
    String nombre;
    int num_sesiones;
    Docente docente;
    Matricula matriculas[];
    int ind_matriculas;
    Session sessions[];
    int ind_sessions;
    
    public String getCodigo(){ return this.codigo; }
    public void setCodigo(String codigo){ this.codigo = codigo; }
    
    public String getNombre(){ return this.nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    
    public int getNumSessions(){ return this.num_sesiones; }
    
    public Docente getDocente(){ return this.docente; }
    public void setDocente(Docente docente){ this.docente = docente; }
    
    public Matricula[] getMatriculas(){ return this.matriculas; }
    public int getIndMatriculas(){ return this.ind_matriculas; }
    
    public Session[] getSessions(){ return this.sessions; }
    public int getIndSessions(){ return this.ind_sessions; }
    
    public Curso(String codigo, String nombre, int num_sesiones, Docente docente){
        this.codigo = codigo;
        this.nombre = nombre;
        this.num_sesiones = num_sesiones;
        this.docente = docente;
        this.ind_matriculas = 0;
        this.ind_sessions = 0;
    }
    
    public void agregarMatricula(Matricula matricula){
        this.matriculas[this.ind_sessions] = matricula;
        this.ind_sessions++;
    }
    
    public Matricula buscarMatricula(Alumno alumno){
        for(int i=0; i<ind_matriculas; i++){
            if(matriculas[i].getAlumno() == alumno){
                return matriculas[i];
            }
        }
        return null;
    }
    
    public boolean agregarSession(Session session){
        if(ind_sessions < num_sesiones){ // Limitado al numero de sesiones
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
                    asistencias[ind_asistencias] = sessions[i].getAsistencias()[j];
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
        return 100*contador/(asistencias.length+0.0);
    }
    
    // Metodo agregado para solucionar el problema de acceso o llamada a la funcion de calculo de promedios de la clase matricula
    public void calcularPromedios(){
        for(int i=0; i<ind_matriculas; i++){
            float porc_asis = calcularPorcentajeAsistencia(this.matriculas[i].getAlumno());
            this.matriculas[i].calcularPromedio(porc_asis);
        }
    }
}
