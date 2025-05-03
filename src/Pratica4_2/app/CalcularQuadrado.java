package Pratica4_2.app;

import Pratica4_2.interfaces.CalculoGeometrico;

public class CalcularQuadrado implements CalculoGeometrico {

    private double lado;
    private double areaQuadrado;
    private double perimetroQuadrado;

    public CalcularQuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }
    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }
    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(lado, 2);
        setAreaQuadrado(area);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 4 * lado;
        setPerimetroQuadrado(perimetro);
        return perimetro;
    }
}
