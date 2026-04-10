/**
 * ============================================================
 * Instituto Politécnico de Tomar
 * Programação Orientada a Objetos
 * Benquerer
 * poo@benquerer.dev
 * ============================================================
 * ExMatrix.java
 * 4/10/2026
 * Descrição:    TODO - Descreve o propósito desta classe
 * ============================================================
 */
package programs;

import classes.Matrix;
import classes.Vetor;

import java.util.Scanner;

public class ExMatrix {
    //=====  Ex. 01
    public static void Ex01() {
        Matrix mat = new Matrix(3,3);
        mat.fillRandom(0,100);
        System.out.println(mat.toString());
    }

    //=====  Ex. 02
    public static void Ex02() {
        Matrix mat = new Matrix(3,3);
        mat.fillRandom(0,100);
        System.out.println(mat.toString());
        System.out.println("Lowest value: " + mat.getMin());
        System.out.println("Highest value: " + mat.getMax());
    }

    //=====  Ex. 03
    public static void Ex03() {
        Matrix mat = new Matrix(3,3);
        mat.fillRandom(0,9);
        System.out.println(mat.toString());
        Scanner keyb = new Scanner(System.in);
        System.out.println("What's the value you want to check?");
        int num = keyb.nextInt();
        System.out.println(mat.contains(num) ? "The number \"" + num + "\" appears in the matrix!" : "The matrix does not contain \"" + num + "\"!");
    }

    //=====  Ex. 04
    public static void Ex04() {
        Matrix mat = new Matrix(3,3);
        mat.fillRandom(0,9);
        System.out.println(mat.toString());
        Scanner keyb = new Scanner(System.in);
        System.out.println("What's the value you want to count?");
        int num = keyb.nextInt();
        System.out.println("The number \"" + num + "\" appears in the matrix " + mat.count(num) + " times!");
    }

    //=====  Ex. 05
    public static void Ex05() {
        Matrix mat = new Matrix(3,3);
        mat.fillRandom(0,1);
        System.out.println(mat.toString());
        System.out.println("The total sum of the matrix is: " + mat.sumAll());
    }

    //=====  Ex. 06
    public static void Ex06() {
        Matrix mat = new Matrix(3,3);
        mat.fillRandom(0,9);
        System.out.println(mat.toString());
        Vetor vet = mat.toVetor();
        System.out.println(vet.toString());

    }

    //=====  Ex. 07
    public static void Ex07() {
        Vetor vet = new Vetor(7);
        vet.fillRandom(0,9);
        System.out.println(vet.toString());
        Matrix mat = vet.toMatrix(4);
        System.out.println(mat.toString());
    }

    //=====  Ex. 08
    public static void Ex08() {
        Matrix mat1 = new Matrix(3, 3);
        Matrix mat2 = new Matrix(3, 3);
        mat1.fillRandom(0, 9);
        mat2.fillRandom(0, 9);
        System.out.println("Matrix A:");
        System.out.println(mat1.toString());
        System.out.println("Matrix B");
        System.out.println(mat2.toString());
        System.out.println("A + B:");
        System.out.println(Matrix.addMatrix(mat1, mat2).toString());
        System.out.println("A - B:");
        System.out.println(Matrix.subtractMatrix(mat1, mat2).toString());
    }

    //=====  Ex. 09
    public static void Ex09() {
        Matrix mat = new Matrix(2, 3);
        mat.fillRandom(0, 9);
        System.out.println("Matrix:");
        System.out.println(mat.toString());
        System.out.println("Transposed:");
        System.out.println(mat.transpose().toString());
    }

    //=====  Ex. 10
    public static void Ex10() {
        Matrix mat1 = new Matrix(2, 3);
        Matrix mat2 = new Matrix(3, 2);
        mat1.fillRandom(0, 9);
        mat2.fillRandom(0, 9);
        System.out.println("Matrix A:");
        System.out.println(mat1.toString());
        System.out.println("Matrix B:");
        System.out.println(mat2.toString());
        System.out.println("Multiplication result:");
        System.out.println(Matrix.multiplyMatrix(mat1, mat2).toString());
    }

    static void main(String[] args) {
        Ex01();
    }
}
