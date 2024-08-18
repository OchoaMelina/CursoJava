import java.util.Scanner;

public class Login{
  public static void main(String args[]){

  String usuario = "", password = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Usuario: ");
  usuario = entrada.nextLine();

  System.out.print("Contraseña: ");
  password = entrada.nextLine();
  
  if(usuario.equals("melys") && password.equals("12345")){
   System.out.println("Inicio de sesion correcto");
  } else {
      System.out.println("Usuario y/o contraseña incorrecta");
  }
 }
}