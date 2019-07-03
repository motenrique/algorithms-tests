package com.itisol;


import com.itisol.number.ConvertNumber;
import org.junit.Assert;
import org.junit.Test;

public class ConvertNumberToStringTest {

    @Test
    public void testNumberUnderOneThousand() throws Exception {

        int firstNumber = 345;
        int secondNumber = 100;
        int thirdNumber = 5;
        int fourthNumber = 42;

        Assert.assertEquals("345", ConvertNumber.convertNumberToCommaFormattedString(firstNumber));
        Assert.assertEquals("100", ConvertNumber.convertNumberToCommaFormattedString(secondNumber));
        Assert.assertEquals("5", ConvertNumber.convertNumberToCommaFormattedString(thirdNumber));
        Assert.assertEquals("42", ConvertNumber.convertNumberToCommaFormattedString(fourthNumber));
    }


    @Test
    public void testNumberMoreThanOneThousand() throws Exception {

        int firstNumber = 3450;
        int secondNumber = 1000;
        int thirdNumber = 534435;
        int fourthNumber = 42345;

        Assert.assertEquals("3,450", ConvertNumber.convertNumberToCommaFormattedString(firstNumber));
        Assert.assertEquals("1,000", ConvertNumber.convertNumberToCommaFormattedString(secondNumber));
        Assert.assertEquals("534,435", ConvertNumber.convertNumberToCommaFormattedString(thirdNumber));
        Assert.assertEquals("42,345", ConvertNumber.convertNumberToCommaFormattedString(fourthNumber));
    }

    @Test
    public void testNumberMoreThanOneMillion() throws Exception {

        int firstNumber = 34503456;
        int secondNumber = 1000000;
        int thirdNumber = 53443565;
        int fourthNumber = 45000000;

        Assert.assertEquals("34,503,456", ConvertNumber.convertNumberToCommaFormattedString(firstNumber));
        Assert.assertEquals("1,000,000", ConvertNumber.convertNumberToCommaFormattedString(secondNumber));
        Assert.assertEquals("53,443,565", ConvertNumber.convertNumberToCommaFormattedString(thirdNumber));
        Assert.assertEquals("45,000,000", ConvertNumber.convertNumberToCommaFormattedString(fourthNumber));
    }

}
