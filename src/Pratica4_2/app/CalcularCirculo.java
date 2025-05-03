package Pratica4_2.app;

import Pratica4_2.interfaces.CalculoGeometrico;

public class CalcularCirculo implements CalculoGeometrico {

    private double raio;
    private double areaCirculo;
    private double perimetroCirculo;

    public CalcularCirculo(double raio) {
        this.raio = raio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }
    public void setAreaCirculo(double areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public double getPerimetroCirculo() {
        return perimetroCirculo;
    }
    public void setPerimetroCirculo(double perimetroCirculo) {
        this.perimetroCirculo = perimetroCirculo;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio,2);
        setAreaCirculo(area);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        setPerimetroCirculo(perimetro);
        return perimetro;
    }
}
