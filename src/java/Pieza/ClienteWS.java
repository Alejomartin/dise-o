
package Pieza;

/**
 *
 * @author uniminuto
 */
public class ClienteWS {

    public static void main(String[] args) {
        Director director = new Director();
        FiguraBuilder LetraFiguraBuilder = new ConstructorFiguraL();
        director.setFiguraBuilder(LetraFiguraBuilder);
        Object[][] f1 = director.construirFigura();
        System.out.println("Original");
        MatrixUtil.printMatrix(f1, 3, 3);
        //Object[][] f2 = director.girarFigura("izquierda", f1);
        System.out.println("Girar derecha");
        MatrixUtil.printMatrix(director.girarFigura("derecha", f1), 3, 3);
        MatrixUtil.printMatrix(director.girarFigura("derecha", f1), 3, 3);
        MatrixUtil.printMatrix(director.girarFigura("derecha", f1), 3, 3);
        MatrixUtil.printMatrix(director.girarFigura("derecha", f1), 3, 3);

        System.out.println("Girar izquierda");
        MatrixUtil.printMatrix(director.girarFigura("izquierda", f1), 3, 3);
        MatrixUtil.printMatrix(director.girarFigura("izquierda", f1), 3, 3);
        MatrixUtil.printMatrix(director.girarFigura("izquierda", f1), 3, 3);
        MatrixUtil.printMatrix(director.girarFigura("izquierda", f1), 3, 3);

        System.out.println("Mover derecha");
        MatrixUtil.printMatrix(director.moverFigura("derecha", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("derecha", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("derecha", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("derecha", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("derecha", f1), 3, 3);
          System.out.println("Mover izquierda");
        MatrixUtil.printMatrix(director.moverFigura("izquierda", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("izquierda", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("izquierda", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("izquierda", f1), 3, 3);
        MatrixUtil.printMatrix(director.moverFigura("izquierda", f1), 3, 3);

        /* Object[][] f2 = director.moverFigura("derecha", f1);
         MatrixUtil.printMatrix(f2, 2, 2);
         Object[][] f3 = director.moverFigura("izquierda", f2);
         MatrixUtil.printMatrix(f3, 2, 2);
         Object[][] f4 = director.moverFigura("abajo", f3);
         MatrixUtil.printMatrix(f4, 2, 2);*/
        Figura figura = director.getFigura();

    }
}
