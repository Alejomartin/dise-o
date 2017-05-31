/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Pieza.ConstructorFiguraL;
import Pieza.Director;
import Pieza.FiguraBuilder;
import Pieza.MatrixUtil;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "CuadradoWebService")
@Stateless()
public class LetraLWebService {

    @WebMethod(operationName = "girar")
    public Object[][] girar(@WebParam(name = "direccion") String direccion) {
        Director director = new Director();
        FiguraBuilder cuadradoFiguraBuilder = new ConstructorFiguraL();
        director.setFiguraBuilder(cuadradoFiguraBuilder);
        Object[][] cuadradoBase = cuadradoBase = director.construirFigura();
        Object[][] resultado = director.girarFigura("direccion", cuadradoBase);
        MatrixUtil.printMatrix(resultado, 2, 2);
        return resultado;
    }

    @WebMethod(operationName = "desplazar")
    public Object[][] desplazar(@WebParam(name = "direccion") String direccion) {
        Director director = new Director();
        FiguraBuilder cuadradoFiguraBuilder = new ConstructorFiguraL();
        Object[][] cuadradoBase = director.construirFigura();
        director.setFiguraBuilder(cuadradoFiguraBuilder);
        Object[][] resultado = director.moverFigura(direccion, cuadradoBase);
        MatrixUtil.printMatrix(resultado, 2, 2);
        return resultado;
    }

    @WebMethod(operationName = "bajar")
    public Object[][] bajar() {
        Director director = new Director();
        FiguraBuilder cuadradoFiguraBuilder = new ConstructorFiguraL();
        Object[][] cuadradoBase = director.construirFigura();
        director.setFiguraBuilder(cuadradoFiguraBuilder);
        Object[][] resultado = director.moverFigura("abajo", cuadradoBase);
        MatrixUtil.printMatrix(resultado, 2, 2);
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation() {
        //TODO write your implementation code here:
        return null;
    }

}
