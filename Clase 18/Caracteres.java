import java.util.Scanner;

public class Caracteres{
  public static void main(String args[]){
  
  String cadena_original = "", cadena_sustraccion = "";
  int num_caracteres = 0, desde = 0, hasta = 0;
  Scanner in = new Scanner(System.in);

  System.out.print("Ingrese una cadena de caracteres: ");
  cadena_original = in.nextLine();
  
  num_caracteres = cadena_original.length();
  System.out.println("La cadena tiene " + cadena_original + " posee " +
                      num_caracteres + " caracteres");

  System.out.println("Ingrese desde donde quiere sustraer ");
  desde = in.nextInt();
  System.out.println("Ingrese hasta donde quiere sustraer ");
  hasta = in.nextInt();

  cadena_sustraccion = cadena_original.substring(desde,hasta);
  System.out.println("Asi quedo su cadena: " + cadena_sustraccion);


 }
}