package app;

public class PersonaArreglo {
    private Persona personas[];
    private int indice;
    
    public PersonaArreglo (Persona persona){
        boolean flag = false;
        if(!lleno()){
            this.personas[this.indice] = persona;
            this.indice++;
        }
    }
    
    private boolean lleno(){
        return this.personas.length == indice; //compara el ancho del arreglo con el índice, si son iguales, entonces está lleno.
    }
    
    public Cliente[] getClientes(){
        Cliente resultado[] = null;
        return resultado;    
    }
        
    public Empleado[] getEmpleados(){
        Empleado resultado[] = null;
        return resultado;    
    }
    
    
    public Persona getPersona(String documento){
        Persona resultado = null;
        for (Persona p : this.personas){
            if(p.getDocumento().equalsIgnoreCase(documento)){
                resultado = p;
                break;
            }
        }
        return resultado;
    }
    
    
    @Override
    public String toString(){
        return "miau";
    }
    
}
