/**
 * ============================================================
 * Instituto Politécnico de Tomar
 * Programação Orientada a Objetos
 * Benquerer
 * poo@benquerer.dev
 * ============================================================
 * ExVetores.java
 * 4/10/2026
 * Descrição:    TODO - Descreve o propósito desta classe
 * ============================================================
 */
package programs;

import classes.Vetor;

import java.util.Scanner;

public class ExVetores {
    //=====  Ex. 01
    public static void Ex01() {
        Scanner keyb = new Scanner(System.in);
        System.out.println("What's the size for the array? (Use whole numbers like 1,2,3...)");
        int size = keyb.nextInt();
        Vetor vetor = new Vetor(size);
        vetor.fillRandom(0,9);
        System.out.println(vetor.toString());
    }

    //=====  Ex. 02
    public static void Ex02() {
        Scanner keyb = new Scanner(System.in);
        System.out.println("What's the size for the array? (Use whole numbers like 1,2,3...)");
        int size = keyb.nextInt();
        Vetor vetor = new Vetor(size);
        vetor.fillRandom(0,9);
        System.out.println(vetor.toString());
        System.out.println("Lowest value: " + vetor.getMin());
        System.out.println("Highest value: " + vetor.getMax());
    }

    //=====  Ex. 03
    public static void Ex03() {
        Scanner keyb = new Scanner(System.in);
        System.out.println("What's the size for the array? (Use whole numbers like 1,2,3...)");
        int size = keyb.nextInt();
        Vetor vetor = new Vetor(size);
        vetor.fillRandom(0,9);
        System.out.println(vetor.toString());
        System.out.println("Total sum of all values: " + vetor.getSum());
    }

    //=====  Ex. 04
    public static void Ex04() {
        Scanner keyb = new Scanner(System.in);
        System.out.println("What's the size for the array? (Use whole numbers like 1,2,3...)");
        int size = keyb.nextInt();
        Vetor vetor = new Vetor(size);
        vetor.fillRandom(0,9);
        System.out.println("Original vetor: " + vetor.toString());
        vetor.invert();
        System.out.printf("Inverted array: " + vetor.toString());
    }

    //=====  Ex. 05
    public static void Ex05() {
        Scanner keyb = new Scanner(System.in);
        System.out.println("What's the size for the array? (Use whole numbers like 1,2,3...)");
        int size = keyb.nextInt();
        Vetor vetor = new Vetor(size);
        vetor.fillRandom(0,9);
        System.out.println(vetor.toString());
        System.out.println("There are " + vetor.countEven() + " even numbers in the vetor.");
    }

    //=====  Ex. 06
    public static void Ex06() {
        Vetor vet1 = new Vetor(5);
        vet1.fillRandom(0,9);
        System.out.println(vet1.toString());
        Vetor vet2 = vet1.extractEvens();
        System.out.println(vet2.toString());
    }

    //=====  Ex. 07
    public static void Ex07() {
        Vetor vet1 = new Vetor(5);
        vet1.fillRandom(0,9);
        System.out.println(vet1.toString());
        Vetor vet2 = vet1.extractOdds();
        System.out.println(vet2.toString());
    }

    //=====  Ex. 08
    public static void Ex08() {
        Vetor vet1 = new Vetor(3);
        Vetor vet2 = new Vetor(3);
        vet1.fillRandom(0,9);
        vet2.fillRandom(0,9);
        System.out.println("vet1: " + vet1.toString());
        System.out.println("vet2: " + vet2.toString());
        Vetor vet3 = Vetor.addVets(vet1,vet2);
        Vetor vet4 = Vetor.subtractVets(vet1,vet2);
        System.out.println("Adding by position: " + vet3.toString());
        System.out.println("Subtracting by position: " + vet4.toString());
    }

    //=====  Ex. 09
    public static void Ex09() {
        Vetor vet1 = new Vetor(3);
        Vetor vet2 = new Vetor(3);
        vet1.fillRandom(0,9);
        vet2.fillRandom(0,9);
        System.out.println("vet1: " + vet1.toString());
        System.out.println("vet2: " + vet2.toString());
        Vetor vet3 = Vetor.multiplyVets(vet1,vet2);
        System.out.println("Multiplying by position: " + vet3.toString());
    }

    //=====  Ex. 10
    public static void Ex10() {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Initial value:");
        int init = keyb.nextInt();
        System.out.println("Last value:");
        int fim = keyb.nextInt();
        System.out.println("Step by:");
        int step = keyb.nextInt();
        Vetor vetor = Vetor.range(init,fim,step);
        System.out.println(vetor.toString());
    }

    static void main(String[] args) {
        Ex01();
    }

}
