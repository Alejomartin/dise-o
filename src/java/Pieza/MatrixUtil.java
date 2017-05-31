/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author uniminuto
 */
public class MatrixUtil {

    public static <T> List<T> twoDArrayToList(T[][] twoDArray) {
        List<T> list = new ArrayList<T>();
        for (T[] array : twoDArray) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }

    public static Object[][] copyArray(Object[][] old) {
        Object[][] current = new Object[old.length][old[0].length];
        for (int i = 0; i < old.length; i++) {
            for (int j = 0; j < old[i].length; j++) {
                current[i][j] = old[i][j];
            }
        }
        return current;
    }

    public static void printMatrix(Object[][] twoDm, int alto, int ancho) {
        try {
            int rows = alto;
            int columns = ancho;
            String str = "|\t";

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    str += twoDm[i][j] + "\t";
                }

                System.out.println(str + "|");
                str = "|\t";
            }

        } catch (Exception e) {

        }
        System.out.println("");
    }
}
