package Pratica4_2.app;

import Pratica4_2.interfaces.CalculoGeometrico;

public class CalcularTriangulo implements CalculoGeometrico {

    private double base;
    private double altura;
    private double areaTriangulo;
    private double perimetroTriangulo;

    public CalcularTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }
    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public double getPerimetroTriangulo() {
        return perimetroTriangulo;
    }
    public void setPerimetroTriangulo(double perimetroTriangulo) {
        this.perimetroTriangulo = perimetroTriangulo;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura) /2;
        setAreaTriangulo(area);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        setPerimetroTriangulo(perimetro);
        return perimetro;
    }
}
