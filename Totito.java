import java.io.*;
import java.lang.Math;
public class Totito {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Persona 1: ");
        String player1 = input.readLine();
        System.out.print("Persona 2: ");
        String player2 = input.readLine();
        int min = 1;
        int max = 2;
        int rango = max - min + 1;
        int a = (int)(Math.random() * rango)+ min;
        String sim1 = "";
        String sim2 = "";
        if (a == 1) {
            sim1 = "X";
            sim2 = "O";
        } else {
            sim1 = "O";
            sim2 = "X";
        }
        System.out.println("El simbolo de " + player1 + " es: " + sim1);
        System.out.println("El simbolo de " + player2 + " es: " + sim2);
        String[] Juego = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean x = true;
        int turno1 = 0;
        int conversor1 = 0;
        int turno2 = 0;
        int conversor2 = 0;
        while(x == true) {
            System.out.println(" " +Juego[0] + " "  + "|" + " " + Juego[1] + " " + "|" + " " + Juego[2]);
            System.out.println("---+---+---");
            System.out.println(" " +Juego[3] + " "  + "|" + " " + Juego[4] + " " + "|" + " " + Juego[5]);
            System.out.println("---+---+---");
            System.out.println(" " +Juego[6] + " "  + "|" + " " + Juego[7] + " " + "|" + " " + Juego[8]);
            if (sim1.equals("X")) {
                System.out.println("Es el turno de " + player1);
                turno1 = Integer.parseInt(input.readLine());
                conversor1 = turno1 - 1;
                if ((Juego[conversor1].equals("O")) || (conversor1 > 9)) {
                    System.out.println("Opción invalida");
                } else {
                    Juego[conversor1] = "X";
                }
                System.out.println("Es el turno de " + player2);
                turno2 = Integer.parseInt(input.readLine());
                conversor2 = turno2 - 1;
                if ((Juego[conversor2].equals("X")) || (conversor2 > 9)) {
                    System.out.println("Opción invalida");
                } else {
                    Juego[conversor2] = "O";
                }
            } else if (sim2.equals("X")) {
                System.out.println("Es el turno de " + player2);
                turno1 = Integer.parseInt(input.readLine());
                conversor1 = turno1 - 1;
                if ((Juego[conversor1].equals("O")) || (conversor1 > 9)) {
                    System.out.println("Opción invalida");
                } else {
                    Juego[conversor1] = "X";
                }
                System.out.println("Es el turno de " + player1);
                turno2 = Integer.parseInt(input.readLine());
                conversor2 = turno2 - 1;
                if ((Juego[conversor2].equals("X")) || (conversor2 > 9)) {
                    System.out.println("Opción invalida");
                } else {
                    Juego[conversor2] = "O";
                }
            }
            if ((Juego[0].equals("X") && Juego[1].equals("X") && Juego[2].equals("X")) || (Juego[3].equals("X") && Juego[4].equals("X") && Juego[5].equals("X")) || (Juego[6].equals("X") && Juego[7].equals("X") && Juego[8].equals("X")) || (Juego[0].equals("X") && Juego[3].equals("X") && Juego[6].equals("X")) || (Juego[1].equals("X") && Juego[4].equals("X") && Juego[7].equals("X")) || (Juego[2].equals("X") && Juego[5].equals("X") && Juego[8].equals("X")) || (Juego[0].equals("X") && Juego[4].equals("X") && Juego[8].equals("X")) || (Juego[2].equals("X") && Juego[4].equals("X") && Juego[6].equals("X"))) {
                if (sim1.equals("X")) {
                    System.out.println("Felicitaciones, " + player1 + " ha ganado");
                    x = false;
                } else if (sim2.equals("X")) {
                    System.out.println("Felicitaciones, " + player2 + " ha ganado");
                    x = false;
                }
            } else if ((Juego[0].equals("O") && Juego[1].equals("O") && Juego[2].equals("O")) || (Juego[3].equals("O") && Juego[4].equals("O") && Juego[5].equals("O")) || (Juego[6].equals("O") && Juego[7].equals("O") && Juego[8].equals("O")) || (Juego[0].equals("O") && Juego[3].equals("O") && Juego[6].equals("O")) || (Juego[1].equals("O") && Juego[4].equals("O") && Juego[7].equals("O")) || (Juego[2].equals("O") && Juego[5].equals("O") && Juego[8].equals("O")) || (Juego[0].equals("O") && Juego[4].equals("O") && Juego[8].equals("O")) || (Juego[2].equals("O") && Juego[4].equals("O") && Juego[6].equals("O"))) {
                if (sim1.equals("O")) {
                    System.out.println("Felicitaciones, " + player1 + " ha ganado");
                    x = false;
                } else if (sim2.equals("O")) {
                    System.out.println("Felicitaciones, " + player2 + " ha ganado");
                    x = false;
                }
            }
        }
    }
}