package ttask4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTestClass {


    @Test(dataProvider = "dataTest")
    public void TestOnePlusOne(long first, long second, long third){

    long sum = calculator.sum(first,second);
        Assert.assertEquals(sum,third);
    }

    @DataProvider(name = "dataTest")
    public Object[][] dataForDivLongPositive() {
        return new Object[][] {
                { 1, 1, 2 },
                { -1, 1, 0 },
                { -1, -2, -3 },
                { 0, 1, 1 },
                { -5, 5, 0 }
        };
    }


    @Test(dataProvider = "dataTest2")
    public void TestOnePlusOneDouble(double first, double second, double third){

        double sum = calculator.sum(first,second);
        Assert.assertEquals(sum,third);
    }

    @DataProvider(name = "dataTest2")
    public Object[][] dataForSumDouble() {
        return new Object[][] {
                { 1.0, 1.0, 2.0 },
                { -1.0, 1.0, 0.0 },
                { -1.0, -2.0, -3.0 },
                { 0, 1.0, 1.0 },
                { -5.0, 5.0, 0 }
        };
    }




}
