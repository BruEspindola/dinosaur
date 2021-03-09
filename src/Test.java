import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test {

  public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            Dinosaur Skeep = new Dinosaur();
            do {

                System.out.println("-----------------------------------------------------------------");
 
                System.out.println(" 🦕 Status Skeep: \n" + "Energia: " + Skeep.energy + "             "
                        + "Velocidade: " + Skeep.velocity + "\n" + "Temperatura: " + Skeep.temperature
                        + "              " + "Humor: " + Skeep.mood + "\n");

                System.out.println("-----------------------------------------------------------------");

                System.out.println(" 🦕 Actions Skeep: \n" + "P - Pular " + "             " + "R - Correr "
                        + "             " + "C - Comer \n" + "B - Brincar " + "           " + "S - Tomar Sol "
                        + "          " + "O - Ficar na Sombra \n");

                String textUpperCase = scan.nextLine().toUpperCase();
                char choose = textUpperCase.charAt(0);

                switch (choose) {
                case 'P':
                    Skeep.toJump();
                    break;

                case 'R':
                    Skeep.run();
                    break;

                case 'C':
                    Skeep.eat();
                    break;

                case 'B':
                    Skeep.play();
                    break;

                case 'S':
                    Skeep.sunbathe();
                    break;

                case 'O':
                    Skeep.stayInTheShade();
                    break;

                default:
                JOptionPane.showMessageDialog(null,"Diga algo que eu consiga fazer 🙄");
                    break;
                }
            } while (true);
        }
      }
}
