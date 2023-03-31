import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) {
        double apuesta = 100000;
        int partidasGanadas = 0;
        int partidasPerdidas = 0;
        String nombreUsuario;

        Scanner lectura = new Scanner(System.in);


        System.out.print("Ingresa su nombre: ");
         nombreUsuario = lectura.nextLine();

        boolean seguirJugando = true;

        while (seguirJugando) {
            int intentosRestantes = 10;
            char letraIngresada;
            boolean letraEncontrada = false;
            char[] palabraAdivinada;

            String[] palabras = {"gato", "fruta", "computador", "manzanaa", "pera", "perro"};
            String palabraSeleccionada = palabras[(int) (Math.random() * palabras.length)];
            palabraAdivinada = new char[palabraSeleccionada.length()];

            for (int i = 0; i < palabraAdivinada.length; i++) {
                palabraAdivinada[i] = '_';
            }

            while (intentosRestantes > 0 && !palabraSeleccionada.equals(new String(palabraAdivinada))) {
                System.out.print("Palabra a adivinar: ");
                for (char letra : palabraAdivinada) { 
                    System.out.print(letra + " ");
                }
                
                System.out.println("Intentos restantes: " + intentosRestantes);
                System.out.print("Ingresa una letra: ");
                letraIngresada = lectura.next().charAt(0);

                letraEncontrada = false;
                for (int i = 0; i < palabraSeleccionada.length(); i++) {
                    if (palabraSeleccionada.charAt(i) == letraIngresada) {
                        palabraAdivinada[i] = letraIngresada;
                        letraEncontrada = true;
                    }
                }
                if (!letraEncontrada) {
                    intentosRestantes--;
                }
            }
            if (intentosRestantes == 0) {
                System.out.println("Lo siento, " + nombreUsuario + ", perdiste. La palabra era: " + palabraSeleccionada);
                apuesta = apuesta -10000;
                partidasPerdidas++;
            } else {
                System.out.println("¡Felicidades, " + nombreUsuario + "! Adivinaste la palabra: " + palabraSeleccionada);
                apuesta = apuesta +5000;
                partidasGanadas++;
            }

            System.out.println("Tu apuesta actual es de: $" + apuesta);
            System.out.println("Llevas " + partidasGanadas + " partidas ganadas y " + partidasPerdidas + " partidas perdidas.");

            System.out.print("¿Quieres seguir jugando? (si/no): ");
            String respuesta = lectura.next();
            seguirJugando = respuesta.equalsIgnoreCase("si");
        }

        System.out.println("Gracias por jugar, " + nombreUsuario + ". Tu apuesta final es de: $" + apuesta);
        lectura.close();
    }
}
