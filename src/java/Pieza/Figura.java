
package Pieza;

/**
 *
 * @author uniminuto
 */
public class Figura {

    private Integer posicionX;
    private Integer posicionY;
    private Integer alto;
    private Integer ancho;
    private String letraAlfabeto;

    /**
     * @param posicionX the posicionX to set
     */
    public void setPosicionX(Integer posicionX) {
        this.posicionX = posicionX;
    }

    /**
     * @param posicionY the posicionY to set
     */
    public void setPosicionY(Integer posicionY) {
        this.posicionY = posicionY;
    }

    /**
     * @param letraAlfabeto the letraAlfabeto to set
     */
    public void setLetraAlfabeto(String letraAlfabeto) {
        this.letraAlfabeto = letraAlfabeto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }
}
