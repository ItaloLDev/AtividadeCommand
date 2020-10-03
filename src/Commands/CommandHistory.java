package Commands;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itlac
 */
import Interfaces.ICommand;
import java.util.ArrayList; 

public class CommandHistory {
    
   public void add(ICommand command) {
      if (lastExecuted != history.size()-1)
         history.subList(lastExecuted+1, history.size()).clear();
      history.add(command);
      command.redo();
      lastExecuted = history.size()-1;
   }
   public boolean moveBackward() {
      if (lastExecuted >= 0) {
         history.get(lastExecuted--).undo();
         return true;
     } else return false;
   }
  public boolean moveForward() {
      if (lastExecuted < history.size()-1) {
         history.get(++lastExecuted).redo();
         return true;
     } else return false;
   }    
   public void print() {
      if (lastExecuted == -1)
         System.out.println("> ");
      for (int i = 0; i < history.size(); ++i)
         System.out.println(((lastExecuted == i) ? "> ":"  ") + history.get(i));
   }
   private ArrayList<ICommand> history = new ArrayList<ICommand>();
   private int lastExecuted = -1;
}