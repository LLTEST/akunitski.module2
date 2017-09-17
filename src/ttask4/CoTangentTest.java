package ttask4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CoTangentTest extends BaseTestClass {
    @Test(description = "Simle positive ctg:", dataProvider = "dataForCtgPositive", groups = {"positive"})
    public void testCtgPositive(double first, double expected) {
        double ctg = calculator.ctg(first);
        Assert.assertEquals(ctg, expected);
    }

    @DataProvider(name = "dataForCtgPositive")
    public Object[][] dataForCtgPositive() {
        return new Object[][] {
                { 45, 1 },
                { 90, 0 }    //This is a BUG: expected [0.0] but found [1.0]
        };
    }

    @Test(description = "Simle negative ctg:", dataProvider = "dataForCtgNegative",
            expectedExceptions = ArithmeticException.class, groups = {"negative"})
    public void testCtgNegative(double first) {
        calculator.ctg(first);
    }

    @DataProvider(name = "dataForCtgNegative")
    public Object[][] dataForCtg() {
        return new Object[][] {
                { 0 }   // This a BUG: no exception for 0 Ctg.
        };
    }
}