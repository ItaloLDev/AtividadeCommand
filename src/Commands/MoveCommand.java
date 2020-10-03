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
public class MoveCommand implements ICommand{

    private Retangulo retangulo;
    private double novaCoordX, novaCoordY;    
    private double antigaCoordX, antigaCoordY;

    
    public MoveCommand(Retangulo retangulo, double coordX, double coordY) {
        this.retangulo = retangulo;
        this.antigaCoordX = retangulo.getCoordX();
        this.antigaCoordY = retangulo.getCoordY();
        this.novaCoordX = coordX;
        this.novaCoordY = coordY;
    }
    
    

    @Override
    public void redo() {
        retangulo.setCoordX(novaCoordX);
        retangulo.setCoordY(novaCoordY);
    }

    @Override
    public void undo() {
        retangulo.setCoordX(antigaCoordX);
        retangulo.setCoordY(antigaCoordY);
    }
    
    public String toString(){
        return "Posição alterada de ["+antigaPosicaoToString()+"] para "
                + "["+retangulo.getPosicao()+"]";
    }
    
    public String antigaPosicaoToString(){
        return "Coordenada X: "+ this.antigaCoordX +
                " | Coordenada Y: " + this.antigaCoordY;
    }
    
}
