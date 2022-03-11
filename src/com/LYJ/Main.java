package com.LYJ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1. Ecrire un java programme java qui calcule la valeur minimale entre deux valeurs
        FindMin ();

        //2. Ecrire un java programme java qui calcule la valeur minimale entre trois valeurs
        minOfThree ();

        //3. Ecrire un Java programme qui calucule la somme de s:  s = 1 + 3 + 5 +..+ 20 + 21
        calSomme();

        //4. Ecrire un Java programme qui calucule la somme de s:  s = 1 - 2 + 3 + ..- 20 + 21
         calTotal ();

        //5. Ecrire un programme java qui cree un tableau de 5 elements. Calculer la somme des elements qui ont plus ou egale a 20:
         sommeCal();

        //6.  Ecrire un programme java qui cree un tableau de 5 elements de type String. Calculer le nombre des elements dont le nom est : Madrid
          calName ();
    }

    // Exercice 1 :
    public static void FindMin () {
        int[] nums = new int[2];
        System.out.println("Entre value of number 1: ");
        nums[0] = validatorInt ();
        System.out.println("Entre value 0f number 2: ");
        nums[1] = validatorInt ();

        int minNum;
        if (nums[0] <= nums[1]) {
            minNum = nums[0];
        } else {
            minNum = nums[1];
        }
        System.out.println("Minimum Number of "+ nums[0] + " and " + nums[1] + " is: " + minNum + "\n ------------------No.1 end");
    }

    // Exercice 2 :
    public static void minOfThree () {
        int[] nums = new int[3];
        System.out.println("Entre value of number 1: ");
        nums[0] = validatorInt ();
        System.out.println("Entre value 0f number 2: ");
        nums[1] = validatorInt ();
        System.out.println("Entre value 0f number 3: ");
        nums[2] = validatorInt ();

        int minOfThree = nums[0];
        for (int j = 0; j <= 2; j++) {
            if (nums[j] <= minOfThree) {
                minOfThree = nums[j];
            }
        }
        System.out.println("Minimum number of 3 numbers : " +  nums[0] + " " +  nums[1] + " " +  nums[2] + " is: " + minOfThree + "\n ------------------No.2 end");
    }

    // Exercice 3 :
    public static void calSomme() {
        int s = 0;
        for (int i = 1; i <= 21; i += 2) {
            s = s + i;
        }
        System.out.println("Result of s = 1 + 3 + 5 + ... + 20 + 21, the s = " + (s + 20) + "\n ------------------No.3 end");
    }

    // Exercice 4 :
    public static void calTotal () {
        int s = 0;
        for (int i = 1; i <= 21; i++) {
            if (i % 2 == 0) {
                s = s - i;
            } else {
                s = s + i;
            }
        }
        System.out.println("Result of s = 1 - 2 + 3 - 4 + 5 + ... - 20 + 21, the s = " + s + "\n ------------------No.4 end");
    }

    // Exercice 5 :
    public static void sommeCal() {
        int[] numbers = new int[5];
        int somme = 0;

        System.out.println("Please input 5 numbers will calculate total of numbers which >= 20: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Number " + (i+1) + ": of 5");
            numbers[i] = validatorInt ();
            if (numbers[i] >= 20) {
                somme = somme + numbers[i];
            }
        }
        System.out.println("Somme of 5 numbers which >= 20 is: " + somme + "\n ------------------No.5 end");
    }

    // Exercice 6 :
    public static void calName () {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int namesNum = 0;
        String findName = "Madrid";

        System.out.println("Please entre 5 names some of it with 'Madrid'...");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ": of 5 names");
            names[i] = sc.next();
            boolean hasName = findName.equalsIgnoreCase( names[i]);
            if (hasName) {
                namesNum++;
            }
        }
        System.out.println("Total number of name Madrid is: " + namesNum + "\n ------------------No.6 end");
    }

    // Validator pour int numero
    public static int validatorInt () {
        int inputInt;
        Scanner sc = new Scanner(System.in);
        try {
            inputInt = sc.nextInt();
        } catch (Exception e) {
            System.out.println("This is not a number, please try again.");
            return validatorInt ();
        }
        return inputInt;
    }

}
