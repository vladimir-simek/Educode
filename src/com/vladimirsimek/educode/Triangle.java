package com.vladimirsimek.educode;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public boolean isValid() {
        if (a+b>c) {
            if (a+c>b) {
                if (c+b>a) return true;
            }
        }

        return false;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
