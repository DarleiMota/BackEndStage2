package Pratica4_2.app;

import Pratica4_2.interfaces.CalculoGeometrico;

public class CalcularRetangulo implements CalculoGeometrico {

    private double altura;
    private double largura;
    private double areaRetangulo;
    private double perimetroRetangulo;

    public CalcularRetangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAreaRetangulo() {
        return areaRetangulo;
    }
    public void setAreaRetangulo(double areaRetangulo) {
        this.areaRetangulo = areaRetangulo;
    }

    public double getPerimetroRetangulo() {
        return perimetroRetangulo;
    }
    public void setPerimetroRetangulo(double perimetroRetangulo) {
        this.perimetroRetangulo = perimetroRetangulo;
    }

    @Override
    public double calcularArea() {
        double area = altura * largura;
        setAreaRetangulo(area);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        setPerimetroRetangulo(perimetro);
        return perimetro;
    }
}
