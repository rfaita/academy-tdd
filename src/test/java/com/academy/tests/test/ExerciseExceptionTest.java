package com.academy.tests.test;

import com.academy.tests.exception.ExerciseException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.InputMismatchException;

public class ExerciseExceptionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testWithSuccess() {
        //setup
        String x = "2";
        String y = "1";

        //execution
        Integer ret = ExerciseException.divide(x, y);

        //asserts
        Assert.assertEquals(Integer.valueOf(2), ret);
    }

    @Test
    public void testUsingStringWithError() {

        //setup
        expectedException.expectMessage("Entry value must be a integer.");
        expectedException.expect(InputMismatchException.class);

        //exec
        Integer ret = ExerciseException.divide("x", "1");


        //asserts

    }

    @Test
    public void testUsingDoubleWithError() {

        expectedException.expectMessage("Entry value must be a integer.");
        expectedException.expect(InputMismatchException.class);

        Integer ret = ExerciseException.divide("2.0", "1");


    }

    @Test
    public void testUsingStringOnSecondArgWithError() {

        expectedException.expectMessage("Entry value must be a integer.");
        expectedException.expect(InputMismatchException.class);

        Integer ret = ExerciseException.divide("2", "x");


    }

    @Test
    public void testUsingDoubleOnSecondArgWithError() {

        expectedException.expectMessage("Entry value must be a integer.");
        expectedException.expect(InputMismatchException.class);

        Integer ret = ExerciseException.divide("2", "1.0");


    }

    @Test
    public void testDivingByZeroWithError() {

        expectedException.expectMessage("You can not divide for zero.");
        expectedException.expect(ArithmeticException.class);

        Integer ret = ExerciseException.divide("2", "0");


    }


}
