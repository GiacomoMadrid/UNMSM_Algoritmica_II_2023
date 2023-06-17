
package modelo;
import modelo.Usuario;

public class UsuarioArreglo {
    private int indice;
    private Usuario usuarios[];
    
    public UsuarioArreglo(int tamanho){
        this.usuarios = new Usuario[tamanho];
        this.indice = 0;
  
    }

    public Usuario validar(String usuario, String clave){
        Usuario resultado = null;        
        for(short i=0; i<this.indice; i++){
            if(usuarios[i]!=null && usuarios[i].validar(usuario, clave)) {
                resultado = usuarios[i];
                break;
            }
        }        
        return resultado;    
        
    }

    public boolean buscar(String usuario, String clave){
        boolean retorno = false;
        for(short i=0; i<this.indice; i++){
            if(usuarios[i].getLog().getUsuario().equals(usuario) && usuarios[i].getLog().getClave().equals(clave)) {
                retorno = true;  
            }
        }        
        return retorno;    
        
    }    
    
    public void agregar(Usuario usuario){
       this.usuarios[this.indice] = usuario;
       this.indice++;               
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    
}
