package Commands;


import Interfaces.ICommand;
import Models.Retangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itlac
 */
public class ColorChangeCommand implements ICommand{

    private Retangulo retangulo;
    private String antigaCor, novaCor;

    public ColorChangeCommand(Retangulo retangulo, String novaCor) {
        this.retangulo = retangulo;
        this.antigaCor = retangulo.getCor();
        this.novaCor = novaCor;
    }
    
    
    
    @Override
    public void redo() {
        retangulo.setCor(novaCor);
    }

    @Override
    public void undo() {
        retangulo.setCor(antigaCor);
    }
    
    public String toString(){
        return "Cor alterada de ["+ antigaCor +"]"
                + "para ["+ novaCor +"]";
    }
    
}
