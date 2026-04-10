/**
 * ============================================================
 * Instituto Politécnico de Tomar
 * Programação Orientada a Objetos
 * Benquerer
 * poo@benquerer.dev
 * ============================================================
 * Vetor.java
 * 4/02/2026
 * Descrição:    Implementação da classe Vetor, proposta para a realização da Ficha 04
 * ============================================================
 */
package classes;

import java.util.Random;

public class Vetor {
    //  ATTRIBUTES
    //array of int values
    private int[] data;

    //  CONSTRUCTORS
    //default - sets size as 1
    public Vetor() {
        this.data = new int[1];
    }

    //from dimension
    public Vetor(int dim) {
        this.data = new int[dim];
    }

    //from primitive int array
    public Vetor(int[] data) {
        this.data = data.clone();
    }

    //copy
    public Vetor(Vetor v) {
        this.data = v.data.clone();
    }

    //  GETTERS AND SETTERS
    //set all data (replace array)
    public void setData(int[] data) {
        this.data = data.clone();
    }

    // get whole array
    public int[] getData() {
        return data.clone();
    }

    //set value for specific position
    public void setData(int index, int value) {
        data[index] = value;
    }

    //set get value from a specific position
    public int getData(int index) {
        return data[index];
    }

    //  STATIC METHODS
    //add by position
    public static Vetor addVets(Vetor vetA, Vetor vetB) {
        if (vetA.getLength() != vetB.getLength())
            throw new IllegalStateException("The vetores don't have the same length");
        Vetor addedVet = new Vetor(vetA.getLength());
        for (int i = 0; i < vetA.getLength(); i++) {
            int add = vetA.getData(i) + vetB.getData(i);
            addedVet.setData(i, add);
        }
        return addedVet;
    }

    //subtract by position
    public static Vetor subtractVets(Vetor vetA, Vetor vetB) {
        if (vetA.getLength() != vetB.getLength())
            throw new IllegalStateException("The vetores don't have the same length");
        Vetor subtVet = new Vetor(vetA.getLength());
        for (int i = 0; i < vetA.getLength(); i++) {
            int add = vetA.getData(i) - vetB.getData(i);
            subtVet.setData(i, add);
        }
        return subtVet;
    }

    //multiply by position
    public static Vetor multiplyVets(Vetor vetA, Vetor vetB) {
        if (vetA.getLength() != vetB.getLength())
            throw new IllegalStateException("The vetores don't have the same length");
        Vetor multVet = new Vetor(vetA.getLength());
        for (int i = 0; i < vetA.getLength(); i++) {
            int add = vetA.getData(i) * vetB.getData(i);
            multVet.setData(i, add);
        }
        return multVet;
    }

    //range (Ex10)
    public static Vetor range(int init, int fim, int step) {
        Vetor vet = new Vetor(0);
        for (int i = init; i < fim; i += step) {
            vet.append(i);
        }
        return vet;
    }

    //  METHODS
    //get length
    public int getLength() {
        return data.length;
    }

    //append value
    public void append(int val) {
        int[] newData = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        newData[data.length] = val;
        data = newData;
    }

    //random fill
    public void fillRandom(int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(max - min + 1) + min;
        }
    }

    //get min value
    public int getMin() {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int min = data[0];
        for (int v : data) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    //get max value
    public int getMax() {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int max = data[0];
        for (int v : data) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    //add all elements
    public int getSum() {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int sum = 0;
        for (int v : data) {
            sum += v;
        }
        return sum;
    }

    //invert array
    public void invert() {
        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
    }

    //count even numbers
    public int countEven() {
        if (data.length == 0) throw new IllegalStateException("It's is empty!");
        int count = 0;
        for (int v : data) {
            if (v % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //get vetor with even numbers
    public Vetor extractEvens() {
        Vetor evenVet = new Vetor(0);
        for (int v : data) {
            if (v % 2 == 0) {
                evenVet.append(v);
            }
        }
        return evenVet;
    }

    //get vetor with odd numbers
    public Vetor extractOdds() {
        Vetor oddVet = new Vetor(0);
        for (int v : data) {
            if (v % 2 != 0) {
                oddVet.append(v);
            }
        }
        return oddVet;
    }

    //transform vetor to matrix
    public Matrix toMatrix(int cols) {
        int lines = (int) Math.ceil((double) data.length / cols);
        Matrix mat = new Matrix(lines, cols);
        for (int i = 0; i < lines * cols; i++) {
            int val = i < data.length ? data[i] : 0;
            mat.setData(i / cols, i % cols, val);
        }
        return mat;
    }

    //toString
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (int i = 0; i < data.length; i++) {
            str.append(data[i]);
            if (i < data.length - 1) {
                str.append(", ");
            }
        }
        str.append(" ]");
        return str.toString();
    }
}
