/**
 * ============================================================
 * Instituto Politécnico de Tomar
 * Programação Orientada a Objetos
 * Benquerer
 * poo@benquerer.dev
 * ============================================================
 * Matrix.java
 * 4/02/2026
 * Descrição:    Implementação da classe Matrix, proposta para a realização da Ficha 04
 * ============================================================
 */
package classes;

import java.util.Random;

public class Matrix {
    //  ATTRIBUTES
    private int[][] data;

    //  CONSTRUCTORS
    //default
    public Matrix() {
        this.data = new int[1][2];
    }

    //by dimensions
    public Matrix(int lines, int cols) {
        this.data = new int[lines][cols];
    }

    //from primitive int double array
    public Matrix(int[][] data) {
        this.data = data.clone();
    }

    //copy
    public Matrix(Matrix mtx) {
        this.data = mtx.data.clone();
    }

    //  GETTERS & SETTERS
    //set all data
    public void setData(int[][] data) {
        this.data = data.clone();
    }

    //get data
    public int[][] getData() {
        return data.clone();
    }

    //set specific value
    public void setData(int line, int col, int val) {
        this.data[line][col] = val;
    }

    //get specific value
    public int getData(int line, int col) {
        return data[line][col];
    }

    public int getLines() {
        return data.length;
    }

    public int getCols() {
        return data[0].length;
    }

    //  STATIC METHODS
    //check same dimensions
    private static void checkDimensions(Matrix matA, Matrix matB) {
        if (matA.getLines() != matB.getLines() || matA.getCols() != matB.getCols())
            throw new IllegalStateException("Matrices don't have the same dimensions");
    }

    //add mats
    public static Matrix addMatrix(Matrix matA, Matrix matB) {
        checkDimensions(matA, matB);
        Matrix result = new Matrix(matA.getLines(), matA.getCols());
        for (int i = 0; i < matA.getLines(); i++) {
            for (int j = 0; j < matA.getCols(); j++) {
                result.setData(i, j, matA.getData(i, j) + matB.getData(i, j));
            }
        }
        return result;
    }

    //subtract mats
    public static Matrix subtractMatrix(Matrix mtxA, Matrix matB) {
        checkDimensions(mtxA, matB);
        Matrix result = new Matrix(mtxA.getLines(), mtxA.getCols());
        for (int i = 0; i < mtxA.getLines(); i++) {
            for (int j = 0; j < mtxA.getCols(); j++) {
                result.setData(i, j, mtxA.getData(i, j) - matB.getData(i, j));
            }
        }
        return result;
    }

    //multiply matrix
    public static Matrix multiplyMatrix(Matrix matA, Matrix matB) {
        if (matA.getCols() != matB.getLines())
            throw new IllegalStateException("matA cols must match matB lines");
        Matrix result = new Matrix(matA.getLines(), matB.getCols());
        for (int i = 0; i < matA.getLines(); i++) {
            for (int j = 0; j < matB.getCols(); j++) {
                int sum = 0;
                for (int k = 0; k < matA.getCols(); k++) {
                    sum += matA.getData(i, k) * matB.getData(k, j);
                }
                result.setData(i, j, sum);
            }
        }
        return result;
    }

    //METHODS
    //random fill
    public void fillRandom(int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = rnd.nextInt(max - min + 1) + min;
            }
        }
    }

    //get min
    public int getMin() {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int min = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    min = data[i][j];
                }
            }
        }
        return min;
    }

    //get max
    public int getMax() {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int max = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    //contains value
    public boolean contains(int num) {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        for (int[] line : data) {
            for (int i : line) {
                if (i == num) {
                    return true;
                }
            }
        }
        return false;
    }

    //count number
    public int count(int num) {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int count = 0;
        for (int[] line : data) {
            for (int i : line) {
                if (i == num) count++;
            }
        }
        return count;
    }

    //sum all numbers
    public int sumAll() {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
        }
        return sum;
    }

    //transform matrix to vetor
    public Vetor toVetor() {
        Vetor vet = new Vetor(0);
        for (int[] line : data) {
            for (int val : line) {
                vet.append(val);
            }
        }
        return vet;
    }

    // transpose matrix
    public Matrix transpose() {
        Matrix result = new Matrix(data[0].length, data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result.setData(j, i, data[i][j]);
            }
        }
        return result;
    }

    //toString
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            str.append("[ ");
            for (int j = 0; j < data[i].length; j++) {
                str.append(data[i][j]);
                if (j < data[i].length - 1) {
                    str.append("  ");
                }
            }
            str.append(" ]");
            str.append("\n");
        }
        return str.toString();
    }

}
