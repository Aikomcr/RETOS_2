import java.util.Arrays;
import java.util.Scanner;
public class reto2 {
  public static void main(String[] args) {

    String palabra;

    Scanner lectura = new Scanner(System.in);

    System.out.print("Ingresa una palabra para saber si es palindromo o no : ");

    palabra = lectura.nextLine();
 
    char[] letra = palabra.toCharArray();


    char[] caracteresInvertidos = new char[letra.length];

    
    for (int i = 0; i < letra.length; i++) {
      caracteresInvertidos[i] = letra[letra.length - 1 - i];
    }

    boolean equals = Arrays.equals(letra, caracteresInvertidos);
    if (equals) {
      System.out.println("La palabra "+palabra+" es un palíndromo.");
    } else {
      System.out.println("La palabra "+palabra+" no es un palíndromo.");
    }
    lectura.close();
  }
}