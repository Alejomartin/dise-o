/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieza;

/**
 *
 * @author uniminuto
 */
public abstract class FiguraBuilder {

    protected Figura figura;

    public Figura getFigura() {
        return figura;
    }

    public void crearNuevaFigura() {
        figura = new Figura();
    }

    public abstract void buildDimensiones();

    public abstract void buildDefinirLetraAlfabeto();

    public abstract Object[][] buildConstruirArreglo();

    public abstract Object[][] buildaMoverFigura(String direccion, Object[][] arreglo);

    public abstract Object[][] buildaGirarFigura(String direccion, Object[][] arreglo);

}
