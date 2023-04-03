import java.util.Scanner;

public class App {
    
    public static void main(String[] args){
        
        Scanner jin = new Scanner(System.in);
        Profesor profesor;
        String codigo, nombre;
        
        System.out.print("Ingrese el codigo del profesor: ");
        codigo=jin.nextLine();
        System.out.print("Ingrese el nombre del profesor: ");
        nombre=jin.nextLine();
        profesor = new Profesor(codigo, nombre);
        System.out.println(profesor);
        
    }
}