package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hik");
            System.out.println("Введите выражение: ");
            java.util.Scanner enter = new java.util.Scanner(System.in);
            String s = enter.nextLine();
            if(s.equals("exit")){
                break;
            }


            String[] array = s.split(" ");
            SimpleCalculator result = new SimpleCalculator(array);
            Double response = 0.0;

            switch (array[1]) {
                case "+" -> response = result.operation1();
                case "-" -> response = result.operation2();
                case "*" -> response = result.operation3();
                case "/" -> response = result.operation4();
                case "^" -> response = result.operation5();
            }
            System.out.println(response);
        }
    }
}

