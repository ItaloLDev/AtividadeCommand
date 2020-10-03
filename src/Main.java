
import Commands.CommandHistory;
import Commands.ColorChangeCommand;
import Commands.MoveCommand;
import Models.Retangulo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itlac
 */
public class Main {
    
     public static void main(String args[]) {
      Retangulo retangulo = new Retangulo();
      CommandHistory history = new CommandHistory();

      Scanner scanner = new Scanner(System.in);
      int option;
      do {
         System.out.println("");
         history.print();
         System.out.println("\nPosição atual: " + retangulo.getPosicao());
         System.out.println("Cor atual: " + retangulo.getCor());
         System.out.println("\n1 - Mover o retângulo ");
         System.out.println("2 - Altera a cor do retângulo ");
         System.out.println("3 - undo");
         System.out.println("4 - redo");
         System.out.println("5 - Sair da aplicação ");
         System.out.print("\nEscoha sua opção: ");
         option = Integer.parseInt(scanner.nextLine());
         switch(option) {
            case 1:
               System.out.print("Digite a coordenada X: ");
               double coordX = Double.parseDouble(scanner.nextLine());
               System.out.print("\nDigite a coordenada y: ");
               double coordY = Double.parseDouble(scanner.nextLine());
               history.add(new MoveCommand(retangulo, coordX, coordY));
               break;
            case 2:
               System.out.print("Digite a cor: ");
               history.add(new ColorChangeCommand(retangulo, scanner.nextLine()));
               break;
            case 3:
               if (!history.moveBackward()) System.out.println("Não posso mais realizar undo!");
               break;
            case 4:
               if (!history.moveForward()) System.out.println("Não posso mais realizar redo!");
               break;
            }
      } while (option != 5);
   }
    
}
