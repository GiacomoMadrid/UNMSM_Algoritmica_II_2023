
package modelo;

class Matricula {
    boolean estado;
    float promedio;
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

    public float getPromedio() {
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
    public void calcularPromedio(float porc_asis){
        if(porc_asis >= 70){
            float suma = 0;
            for(int i=9; i<indice; i++){
                suma = suma + notas[i].getNota();
            }
            this.promedio = suma/indice;
        }else{
            this.promedio = 10;
        }
    }
}
