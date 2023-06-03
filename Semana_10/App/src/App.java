import java.util.Scanner;
import app.Cliente;
import app.Empleado;
import app.Persona;
import app.PersonaArreglo;
import app.Seguro;
import app.SeguroArreglo;

public class App {

    public static void main(String[] args) {
      Scanner jcin = new Scanner("System.in");
      int num;
      
      System.out.println("Digite la cantidad de personas del arreglo");
      num = jcin.nextInt();
      
      PersonaArreglo personas = new PersonaArreglo(num);
      personas.agregar(new Empleado ("0001", 1000, "Nodrik", "Akrefta", "22200288"));
      personas.agregar(new Cliente (0,0,"Areli", "Anafta", "22200234"));
      
      System.out.println(personas);
      System.out.println("---------------------");  
      Persona perso = personas.getPersona("22200234");
      
      if(p instanceof Cliente){
          System.out.println(((Cliente)perso).getCreditos());
          System.out.println(((Cliente)perso).getPuntos());
      }else{
          System.out.println(((Empleado)perso).getCodigo);
          System.out.println(((Empleado)perso).getSueldo);
      }
      
      System.out.println(perso);
      perso = personas.getPersona("222000288");
      
      
    }
    
    
    
    
    
    
    
}
