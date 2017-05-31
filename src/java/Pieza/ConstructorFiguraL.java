/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieza;

import static Pieza.MatrixUtil.printMatrix;

/**
 *
 * @author uniminuto
 */
public class ConstructorFiguraL extends FiguraBuilder {

    private Integer posicionLX = 0;
    private Integer posicionLY = 0;
    private static final Integer altoL = 3;
    private static final Integer anchoL = 3;
    private static final String letraAlfabetoL = "L";

    @Override
    public void buildDimensiones() {
        figura.setAlto(this.altoL);
        figura.setAncho(this.anchoL);
        figura.setPosicionX(this.posicionLX);
        figura.setPosicionY(this.posicionLY);

    }

    @Override
    public void buildDefinirLetraAlfabeto() {
        figura.setLetraAlfabeto(this.letraAlfabetoL);
    }

    @Override
    public Object[][] buildConstruirArreglo() {

        Object[][] arreglo = new Object[this.altoL][this.anchoL];
        for (int i = 0; i < this.altoL; i++) {
            for (int j = 0; j < this.anchoL; j++) {

                arreglo[i][j] = new Ele(j, i, letraAlfabetoL);;
            }

        }

        return arreglo;
    }

    @Override
    public Object[][] buildaMoverFigura(String direccion, Object[][] arreglo) {
        for (int i = 0; i < this.altoL; i++) {
            for (int j = 0; j < this.anchoL; j++) {
                Ele cuadrado = (Ele) arreglo[i][j];
                if (direccion.equalsIgnoreCase("izquierda")) {
                    int aumento = cuadrado.getPosicionX();
                    cuadrado.setPosicionX(--aumento);
                }
                if (direccion.equalsIgnoreCase("derecha")) {
                    int aumento = cuadrado.getPosicionX();
                    cuadrado.setPosicionX(++aumento);
                }
                if (direccion.equalsIgnoreCase("abajo")) {
                    int aumento = cuadrado.getPosicionY();
                    cuadrado.setPosicionY(++aumento);

                }

            }

        }
        if (direccion.equalsIgnoreCase("izquierda")) {
            this.posicionLX--;

        }
        if (direccion.equalsIgnoreCase("derecha")) {
            this.posicionLX++;
        }
        if (direccion.equalsIgnoreCase("abajo")) {
            this.posicionLY--;
        }

        return arreglo;
    }

    @Override
    public Object[][] buildaGirarFigura(String direccion, Object[][] arreglo) {
        Object[][] arregloAux = MatrixUtil.copyArray(arreglo);
        if (direccion.equalsIgnoreCase("izquierda")) {
            arreglo[0][0] = arregloAux[0][1];
            arreglo[0][1] = arregloAux[1][1];
            arreglo[0][2] = arregloAux[1][2];
            arreglo[1][0] = arregloAux[0][0];
            arreglo[1][1] = arregloAux[1][0];
            arreglo[1][2] = arregloAux[2][1];
            arreglo[2][0] = arregloAux[0][2];
            arreglo[2][1] = arregloAux[2][2];
            arreglo[2][2] = arregloAux[2][0];
        }
        if (direccion.equalsIgnoreCase("derecha")) {
            arreglo[0][0] = arregloAux[0][1];
            arreglo[0][1] = arregloAux[1][1];
            arreglo[0][2] = arregloAux[1][2];
            arreglo[1][0] = arregloAux[0][0];
            arreglo[1][1] = arregloAux[1][0];
            arreglo[1][2] = arregloAux[2][1];
            arreglo[2][0] = arregloAux[0][2];
            arreglo[2][1] = arregloAux[2][2];
            arreglo[2][2] = arregloAux[2][0];

        }

        return arreglo;
    }

}
