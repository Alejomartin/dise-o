
package Pieza;

/**
 *
 * @author uniminuto
 */
public class Director {

    FiguraBuilder figuraBuilder;

    public void setFiguraBuilder(FiguraBuilder fb) {
        figuraBuilder = fb;
    }

    public Figura getFigura() {
        return figuraBuilder.getFigura();
    }

    public Object[][] construirFigura() {
        figuraBuilder.crearNuevaFigura();
        figuraBuilder.buildDimensiones();
        return figuraBuilder.buildConstruirArreglo();

    }

    public Object[][] moverFigura(String direccion, Object[][] arreglo) {
        return figuraBuilder.buildaMoverFigura(direccion, arreglo);

    }

    public Object[][] girarFigura(String direccion, Object[][] arreglo) {
        return figuraBuilder.buildaGirarFigura(direccion, arreglo);

    }
}
