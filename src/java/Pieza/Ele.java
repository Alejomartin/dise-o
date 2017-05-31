package Pieza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uniminuto
 */
public class Ele {

    private int posicionX;
    private int posicionY;
    private String letra;

    public Ele(int posicionX, int posicionY, String letra) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.letra = letra;
    }

    @Override
    public String toString() {
        return this.posicionX + "," + this.posicionY;
        // return ("Objeto cuadrado " + "Posicion :(" + this.getPosicionX() + "," + this.getPosicionY()) + ")" + " Letra :" + this.getLetra();
    }

    /**
     * @return the posicionX
     */
    public int getPosicionX() {
        return posicionX;
    }

    /**
     * @param posicionX the posicionX to set
     */
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    /**
     * @return the posicionY
     */
    public int getPosicionY() {
        return posicionY;
    }

    /**
     * @param posicionY the posicionY to set
     */
    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

}
