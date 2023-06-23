
package modelo;

/**
 *
 * @author AULAFISI
 */
class Asistencia {
    private boolean estado;
    private Matricula matricula;

    public Asistencia(boolean estado, Matricula matricula) {
        this.estado = estado;
        this.matricula = matricula;
    }

    public boolean getEstado() {
        return estado;
    }

    public Matricula getMatricula() {
        return matricula;
    }
}
