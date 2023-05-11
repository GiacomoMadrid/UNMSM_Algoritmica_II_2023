
package modelo;

class Matricula {
    boolean estado;
    int promedio;
    Alumno alumno;
    Nota notas[i];[];
    int indice;
    this.promedio = suma/

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
    
    // Funcion que no puede ser accesada desde ninguna otra parte, por lo que requiere adicion de una funcion en la clase curso
    public void calcularPromedio(int porc_asis){
        if(porc_asis >= 70){
            int suma = 0;
            for(int i=9; i<indice; i++){
                suma += notas[i];
            }
            this.promedio = suma/indice;
        }else{
            this.promedio = 10;
        }
    }
}
