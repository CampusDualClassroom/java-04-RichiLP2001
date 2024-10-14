package com.campusdual.classroom;

public class Exercise04 {


    public static void main(String[] args) {
        int numero = 7;
        System.out.println(sumNum(numero));
        System.out.println(sumEvenNum(numero));
        System.out.println(factorial(numero));
        System.out.println(recursiveFactorial(numero));
        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));

        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");

    }

    public static int sumNum(int num) {
        num = 1;
        int suma = 0;
        for (int i=0 ; i<=5 ; i++){
            suma= suma + i;
        }
        return suma;
    }


    public static int sumEvenNum(int num) {
        num = 40;
        int suma = 0;

        for (int i = 0 ; i <= num ; i++){
            if (i % 2 !=0) {
                continue;
            }
            suma = suma+i;
        }


        return suma;
    }

    public static int factorial(int num) {
        num =1;
        int multi = 1;
        for (int i = 0 ; i <=7 ; i++){
            if (i>0){
                multi = multi*i;
            }
        }

        return multi;
    }

    public static int recursiveFactorial(int num) {

        if (num == 0 ) return 1;
        return num * recursiveFactorial(num-1);

    }
}
