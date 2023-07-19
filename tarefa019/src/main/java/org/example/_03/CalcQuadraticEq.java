package org.example._03;

class calcQuadraticEq {
    public void calcQuadraticEq(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            maiorQueZero(a, b, D);
        }
        else if (D == 0) {
            igualZero(a, b);
        }
        else {
            menorQueZero();
        }
    }
    
    public void maiorQueZero(double a, double b, double D) {
        double x1, x2;
        x1 = (-b - Math.sqrt(D)) / (2 * a);
        x2 = (-b + Math.sqrt(D)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }
    
    public void igualZero(double a, double b) {
        double x;
        x = -b / (2 * a);
        System.out.println("x = " + x);
    }
    
    public void menorQueZero() {
        System.out.println("Equation has no roots");
    }
}