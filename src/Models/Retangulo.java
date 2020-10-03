package Models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itlac
 */
public class Retangulo {
    
    private double coordX, coordY;
    private String cor;
    
    public Retangulo() {
        this.coordX = this.coordY = 0.0;
        this.cor = "Preta";
    }
    
    public void setPosicao( double coordX, double coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    public void setCor( String cor){
        this.cor = cor;
    }
    
    public String getPosicao(){
        return "Coordenada X: "+ this.coordX +
                " | Coordenada Y: " + this.coordY;
    }
    
    public String getCor(){
        return this.cor;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
    
    
}
