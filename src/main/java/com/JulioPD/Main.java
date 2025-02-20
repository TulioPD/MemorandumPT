package com.JulioPD;

import java.util.Arrays;

public class Main {

    private String calculateBMI(int height, int weight) {
        float heightInMeters = height / 100f; //pasar de centímetros a metros
        final float bmi = weight / (heightInMeters * heightInMeters);

        String result;

        if (bmi <= 18.5) {
            result = "Infrapeso"; //Si IMC <= 18,5
        } else if (bmi <= 25.0) {
            result = "Normal"; //Si IMC <= 25,0
        } else if (bmi <= 30.0) {
            result = "Sobrepeso"; //Si IMC <= 30
        } else {
            result = "Obeso"; //Si IMC > 30
        }

        System.out.println("IMC: " + bmi + " - Categoría: " + result);
        return ("IMC: " + bmi + " - Categoría: " + result);
    }

    private int digitAddition(int n){
        //cada múltiplo de 10 se sumará un dígito extra-> 1000= 1+2+3...+9+(1+0)+(1+1)...+(9+9+9)+(1+0+0+0)
        int total=0;
        StringBuilder sb= new StringBuilder(); //Utilización de Stringbuilder para escribir la operación. Se puede eliminar tanto este como el siguiente si solo se erquiere el resultado

        for (int i = 1; i <= n; i++) {
            int currentNumber=i;
            StringBuilder currentSb = new StringBuilder();
            while (currentNumber>0){
                currentSb.insert(0, (currentNumber % 10) + "+");
                total+=currentNumber%10; //sumar dígito actual al total
                currentNumber/=10; //eliminar el dígito actual
            }

            if (i == 1) {
                sb.append(currentSb.substring(0, currentSb.length() - 1));
            } else {
                sb.append("+").append(currentSb.substring(0, currentSb.length() - 1));
            }
        }
        System.out.println("La suma de los dígitos de 1 a " + n + " es: " + total + "\nOperación: " + sb.toString());
        return total;
    }

    private int[] zeroReorderToEnd(int[] digits){
        int index=0;

        for (int i : digits) { //mover números distintos a cero al principio en cada dígito del Array digits
            if (i!=0){
                digits[index++]=i; //si el número actual es diferente de 0 se asignará este número en la posición marcada por index y se le sumará 1
            }
        }

        while (index<digits.length){
            digits[index++]=0; //rellenar el resto del Array con ceros
        }
        return digits;
    }

    public static void main(String[] args) {
        /* ejemplos de prueba
        Main main = new Main();
        main.calculateBMI(186, 72);
        main.digitAddition(12);
        main.zeroReorderToEnd(new int[]{0,1,2,3,0,0,4,5,6,7,8,9,0,9,0,7,7,0,0,5,4,3,2});

         */
    }
}