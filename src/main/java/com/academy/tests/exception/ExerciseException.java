package com.academy.tests.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExerciseException {

    private static final Logger LOGGER = Logger.getLogger(ExerciseException.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("str1:");
        String str1 = scanner.nextLine();
        System.out.println("str2:");
        String str2 = scanner.nextLine();


        try {
            LOGGER.log(Level.INFO, "" + divide(str1, str2));


        } catch (InputMismatchException | ArithmeticException e) {
            LOGGER.log(Level.WARNING, e.getMessage(), e);
        }

//        } catch (InputMismatchException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }

    public static Integer divide(String x, String y) {
        Integer xInt;
        Integer yInt;

        try {
            xInt = Integer.parseInt(x);
            yInt = Integer.parseInt(y);
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Entry value must be a integer.");
        }

        if (yInt <= 0) {
            throw new ArithmeticException("You can not divide for zero.");
        }

        return (xInt / yInt);
    }

}
