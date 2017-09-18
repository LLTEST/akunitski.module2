package ttask4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareTest extends BaseTestClass {
    @Test(description = "Simple positive sqrt:", dataProvider = "dataForSqrtPositive", groups = {"positive"})
    public void SqrtPositive(double first, double expected) {
        double sqrt = calculator.sqrt(first);
        Assert.assertEquals(sqrt, expected);
    }

    @DataProvider(name = "dataForSqrtPositive")
    public Object[][] ForSqrtPositive() {
        return new Object[][] {
                { 9, 3 },
                { 25, 5 },
                { 0, 0 }
        };
    }

    @Test(description = "Simple negative sqrt:", dataProvider = "dataForSqrtNegative",expectedExceptions = ArithmeticException.class,
            groups = {"negative"})
    public void SqrtNegative(double first, String expected) {
        double sqrt = calculator.sqrt(first);
        Assert.assertEquals(sqrt, expected );
    }

    @DataProvider(name = "dataForSqrtNegative")
    public Object[][] ForSqrtNegative() {
        return new Object[][] {
                {-9 , "NaN"}   //  BUG: No exception for negative Sqrt or NaN
        };
    }




}
