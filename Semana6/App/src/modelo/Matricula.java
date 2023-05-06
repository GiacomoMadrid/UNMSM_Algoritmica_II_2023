
package modelo;

class Matricula {
    boolean estado;
    int promedio;
    Alumno alumno;
    Nota notas[];
    int indice;

    public Matricula(Alumno alumno) {
        this.alumno = alumno;
        this.estado = true;
        this.indice = 0;
        this.notas = new Nota[Configuracion.num_notas];
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPromedio() {
        return promedio;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
    public void calcularPromedio(int porc_asistencia){
        
    }
    
    public boolean registrarNota (float nota, NotaTipo tipo){
        boolean retorno = false;
        return retorno;
    }
    
     public boolean actualizarNota (float nota, NotaTipo tipo){
        boolean retorno = false;
        return retorno;
    }
    
    
}
