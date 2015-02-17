/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

/**
 *
 * @author JuanAlfonso
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Punto [x = " + this.x + ", y = " + this.y + "]";
    }

    public boolean igual(Punto p) {
        return (this.x == p.getX() && this.y == p.getY());
    }

    public double distancia(Punto p) {
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public void desplazar(Punto p) {
        this.x = this.x + p.getX();
        this.y = this.y + p.getY();
    }
}
