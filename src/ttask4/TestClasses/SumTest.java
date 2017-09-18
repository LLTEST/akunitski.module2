package ttask4.TestClasses;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTestClass {


    @Test(description = "Positive test for lon sum: ", dataProvider = "dataTest", groups = {"positive"})
    public void OnePlusOne(long first, long second, long third){

    long sum = calculator.sum(first,second);
        Assert.assertEquals(sum,third);
    }

    @DataProvider(name = "dataTest")
    public Object[][] ForDivLongPositive() {
        return new Object[][] {
                { 100, 100, 200 },
                { -100, 100, 0 },
                { -1, -2, -3 },
                { 22, 5, 27 },
                { -95, 5, -90 }
        };
    }


    @Test(description = "Positive test for double sum: ", dataProvider = "dataTest2", groups = {"positive"})
    public void OnePlusOneDouble(double first, double second, double third){

        double sum = calculator.sum(first,second);
        Assert.assertEquals(sum,third);
    }

    @DataProvider(name = "dataTest2")
    public Object[][] ForSumDouble() {
        return new Object[][] {
                { 100000.0, 1.0, 100001.0 },
                { -1.0, 1.0, 0.0 },
                { -1.0, -2.0, -3.0 },
                { 0, 1.0, 1.0 },
                { -5.0, 5.0, 0 }
        };
    }




}
